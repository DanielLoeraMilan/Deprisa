import greenfoot.*;  
import java.util.*;
import java.io.*;
import java.io.BufferedWriter;

public class RecordsManager extends World
{
    private List<GameRecord> records = new LinkedList<>();
    private final int MAXRECORDS=3;
    private String auxName;
    private int auxScore;
    
    public RecordsManager(String nameInput, int score)
    {    
        super(600, 400, 1);
        
        GameRecord newRecord = new GameRecord(nameInput, score);
        records.add(newRecord);
        
        try{
            guardar(records);
        }catch(IOException e){
            
        }
        
        try{
            records=this.leer();
        }catch(IOException e){
            
        }
        
        records.sort(Comparator.comparingInt(GameRecord::getScore));
        
        if(records.size()<=MAXRECORDS){
            for(int i=0; i<records.size(); i++){
                auxName=records.get(i).getName();
                auxScore=records.get(i).getScore();
                GameRecord recordImage = new GameRecord();
                recordImage.setImage(new GreenfootImage("Nombre: "+auxName+"   Puntaje: "+auxScore+" puntos",30,Color.BLACK,Color.BLACK));
                addObject(recordImage, 280, 150+(50*i));
            }
        }else{
            int newSize=records.size()-MAXRECORDS;
            for(int i=newSize-1; i<records.size()-1; i++){
                auxName=records.get(i).getName();
                auxScore=records.get(i).getScore();
                GameRecord recordImage = new GameRecord();
                recordImage.setImage(new GreenfootImage("Nombre: "+auxName+"   Puntaje: "+auxScore+" puntos",30,Color.BLACK,Color.BLACK));
                addObject(recordImage, 280, 150+(50*i));
            }
        }
        prepare();
    }
    
    private void guardar(List<GameRecord> records) throws IOException{
        File file = new File("Records.txt");
        
        FileWriter recordsWriterFile = new FileWriter(file,true);
        BufferedWriter recordsWriterBuffer = new BufferedWriter(recordsWriterFile);
        
        for(GameRecord record:records){
            recordsWriterBuffer.write(record.getName()+","+record.getScore()+"\n");
        }
        recordsWriterBuffer.close();
    }
    
    public static List<GameRecord> leer() throws IOException, FileNotFoundException{
        File file = new File("Records.txt");
        
        FileReader recordsFileReader = new FileReader(file);
        BufferedReader recordsBufferedReader = new BufferedReader(recordsFileReader);
        
        List<GameRecord> records = new LinkedList<>();
        
        String line=null;
        
        do{
            line=recordsBufferedReader.readLine();
            if(line==null){
                String[] vectorCadena = line.split(",");
                records.add(new GameRecord(vectorCadena[0], Integer.parseInt(vectorCadena[1])));
            }
        }while(line!=null);
        
        recordsBufferedReader.close();
        return records;
    }
    
    private void prepare(){
        addObject(new LeaveButton(), 300, 350);
    }
}
