import greenfoot.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Level1 extends World
{
    private final int WORLDWIDTH = getWidth();
    private final int WORLDHEIGHT = getHeight();
    
    Pavement pavementTemplate = new Pavement();
    GreenfootImage pavementImage = pavementTemplate.getImage();
    private final int PAVEMENTHEIGHT = pavementImage.getHeight();
    private final int PAVEMENTWIDTH = pavementImage.getWidth();
    
    private final int MAPWIDTH = (int) (WORLDWIDTH/PAVEMENTWIDTH);
    private final int MAPHEIGHT = (int) (WORLDHEIGHT/PAVEMENTHEIGHT);
    
    Grass grassTemplate = new Grass();
    GreenfootImage grassImage = grassTemplate.getImage();
    
    private final String FILENAME="FirstLevel.txt";
    private final String PAVEMENTMARKER="X";
    private final String GRASSMARKER="G";
    String[][] mapArray = new String[MAPHEIGHT][MAPWIDTH];
    
    
    public Level1() throws IOException
    {    
        super(600, 400, 1);
        setBackground("images/BackGroundStreet.png");
        
        mapArray = readMap(MAPWIDTH, MAPHEIGHT, FILENAME);
        drawPavementMap(PAVEMENTWIDTH, PAVEMENTHEIGHT, PAVEMENTMARKER, GRASSMARKER, mapArray);
    }
    
     public void drawPavementMap (int pavementWidth, int pavementHeight, String pavementMarker, String grassMarker, String[][] mapArray)
    {
        int x=0;
        int y=0;
        
        for(y=0; y<mapArray.length; y++)
        {
            for(x=0; x<mapArray[y].length; x++)
            {
                if(mapArray[y][x].equals(pavementMarker))
                {
                    int pavementX = x*pavementWidth + pavementWidth/2;
                    int pavementY = y*pavementHeight + pavementHeight/2;
                    addObject(new Pavement(), pavementX, pavementY);
                } else if(mapArray[y][x].equals(grassMarker))
                {
                    int grassX = x*pavementWidth + pavementWidth/2;
                    int grassY = y*pavementHeight + pavementHeight/2;
                    addObject(new Grass(), grassX, grassY);
                } 
            }
        }
    }
    
    public String[][] readMap(int mapWidth, int mapHeight, String fileName) throws IOException  //possible problems with the file
    {
        BufferedReader br = null;  //Read one line at a time
        String [][] mArray = new String [mapHeight][mapWidth];  //become the mapArray
        try{
            br = new BufferedReader(new FileReader(fileName));
            String l; //Represent he line that we are reading at a particular time
            int mapRow = 0;  //Tell us the row we are on
            while((l=br.readLine())!=null)
            {
                mArray[mapRow] = l.split(""); //split into each character
                mapRow++;
            }
        } finally {
            if(br!=null)
                br.close();
        }
        return mArray;
    }
}
