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
    
    public RecordsManager(){
        super(600, 400, 1);
        setBackground("images/RecordsScreen.png");
        
        try{
            records=this.leer();
        }catch(IOException e){
            
        }
        
        showRecords();
        prepare();
    }
    
    public RecordsManager(String nameInput, int score)
    {    
        super(600, 400, 1);
        setBackground("images/RecordsScreen.png");
        
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
        
        showRecords();
        prepare();
    }
    
    private void showRecords(){
        records.sort(Comparator.comparing(GameRecord::getScore));
        int j=0;
        if(records.size()<=MAXRECORDS){
            for(int i=records.size()-1; i>=0; i--){
                auxName=records.get(i).getName();
                auxScore=records.get(i).getScore();
                GameRecord recordImage = new GameRecord();
                recordImage.setImage(new GreenfootImage("Nombre: "+auxName+"   Puntaje: "+auxScore+" puntos",30,Color.WHITE,Color.BLACK));
                addObject(recordImage, 280, 150+(50*j));
                j++;
            }
        }else{
            int newSize=records.size()-MAXRECORDS;
            for(int i=records.size()-1; i>newSize-1; i--){
                auxName=records.get(i).getName();
                auxScore=records.get(i).getScore();
                GameRecord recordImage = new GameRecord();
                recordImage.setImage(new GreenfootImage("Nombre: "+auxName+"   Puntaje: "+auxScore+" puntos",30,Color.WHITE,Color.BLACK));
                addObject(recordImage, 280, 150+(50*j));
                j++;
            }
        }
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
            if(line!=null){
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
