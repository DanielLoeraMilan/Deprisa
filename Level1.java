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
    RedCar redCarTemplate = new RedCar();
    GreenfootImage redCarImage = redCarTemplate.getImage();
    BlueCar blueCarTemplate = new BlueCar();
    GreenfootImage blueCarImage = blueCarTemplate.getImage();
    YellowCar yellowCarTemplate = new YellowCar();
    GreenfootImage yellowCarImage = yellowCarTemplate.getImage();
    Coin coinTemplate = new Coin();
    GreenfootImage coinImage = coinTemplate.getImage();
    Tuba tubaTemplate = new Tuba();
    GreenfootImage tubaImage = tubaTemplate.getImage();
    VagonetaHud hud=new VagonetaHud();
    Vagoneta vagonetaTemplate = new Vagoneta(hud);
    GreenfootImage vagonetaImage = vagonetaTemplate.getImage();
    
    private final String FILENAME="FirstLevel.txt";
    private final String PAVEMENTMARKER="X";
    private final String GRASSMARKER="G";
    private final String REDCARMARKER="R";
    private final String BLUECARMARKER="B";
    private final String YELLOWCARMARKER="Y";
    private final String COINMARKER="C";
    private final String VAGONETAMARKER="V";
    private final String TUBAMARKER="T";
    String[][] mapArray = new String[MAPHEIGHT][MAPWIDTH];
    
    
    public Level1() throws IOException
    {    
        super(600, 450, 1);
        setBackground("images/BackGroundStreet.png");
        
        mapArray = readMap(MAPWIDTH, MAPHEIGHT, FILENAME);
        drawPavementMap(PAVEMENTWIDTH, PAVEMENTHEIGHT, PAVEMENTMARKER, GRASSMARKER, REDCARMARKER, BLUECARMARKER, YELLOWCARMARKER, COINMARKER, VAGONETAMARKER, TUBAMARKER, mapArray);
        addObject(hud, 0, 0);
    }
    
     public void drawPavementMap (int pavementWidth, int pavementHeight, String pavementMarker, String grassMarker, String redCarMarker, String blueCarMarker, String yellowCarMarker, String coinMarker, String vagonetaMarker, String tubaMarker, String[][] mapArray)
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
                }else if(mapArray[y][x].equals(redCarMarker))
                {
                    int redCarX = x*pavementWidth + pavementWidth/2;
                    int redCarY = y*pavementHeight + pavementHeight/2;
                    addObject(new RedCar(), redCarX, redCarY);
                }else if(mapArray[y][x].equals(blueCarMarker))
                {
                    int blueCarX = x*pavementWidth + pavementWidth/2;
                    int blueCarY = y*pavementHeight + pavementHeight/2;
                    addObject(new BlueCar(), blueCarX, blueCarY);
                }else if(mapArray[y][x].equals(yellowCarMarker))
                {
                    int yellowCarX = x*pavementWidth + pavementWidth/2;
                    int yellowCarY = y*pavementHeight + pavementHeight/2;
                    addObject(new YellowCar(), yellowCarX, yellowCarY);
                }else if(mapArray[y][x].equals(coinMarker))
                {
                    int coinX = x*pavementWidth + pavementWidth/2;
                    int coinY = y*pavementHeight + pavementHeight/2;
                    addObject(new Coin(), coinX, coinY);
                }else if(mapArray[y][x].equals(tubaMarker))
                {
                    int tubaX = x*pavementWidth + pavementWidth/2;
                    int tubaY = y*pavementHeight + pavementHeight/2;
                    addObject(new Tuba(), tubaX, tubaY);
                }else if(mapArray[y][x].equals(vagonetaMarker))
                {
                    int vagonetaX = x*pavementWidth + pavementWidth/2;
                    int vagonetaY = y*pavementHeight + pavementHeight/2;
                    addObject(new Vagoneta(hud), vagonetaX, vagonetaY);
                }
            }
        }
    }
    
    public String[][] readMap(int mapWidth, int mapHeight, String fileName) throws IOException
    {
        BufferedReader br = null;
        String [][] mArray = new String [mapHeight][mapWidth];
        try{
            br = new BufferedReader(new FileReader(fileName));
            String l;
            int mapRow = 0; 
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

