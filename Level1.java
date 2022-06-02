import greenfoot.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Level1 extends Levels
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
    
    RedCarUp redCarUpTemplate = new RedCarUp();
    GreenfootImage redCarUpImage = redCarUpTemplate.getImage();
    RedCarLeft redCarLeftTemplate = new RedCarLeft();
    GreenfootImage redCarLeftImage = redCarLeftTemplate.getImage();
    
    BlueCarDown blueCarDownTemplate = new BlueCarDown();
    GreenfootImage blueCarDownImage = blueCarDownTemplate.getImage();
    BlueCarRight blueCarRightTemplate = new BlueCarRight();
    GreenfootImage blueCarRightImage = blueCarRightTemplate.getImage();
    
    YellowCarRight yellowCarRightTemplate = new YellowCarRight();
    GreenfootImage yellowCarRightImage = yellowCarRightTemplate.getImage();
    YellowCarUp yellowCarUpTemplate = new YellowCarUp();
    GreenfootImage yellowCarUpImage = yellowCarUpTemplate.getImage();
    
    GreyCarRight greyCarRightTemplate = new GreyCarRight();
    GreenfootImage GreyCarRightImage = greyCarRightTemplate.getImage();
    GreyCarLeft greyCarLeftTemplate = new GreyCarLeft();
    GreenfootImage greyCarLeftImage = greyCarLeftTemplate.getImage();
    
    Coin coinTemplate = new Coin();
    GreenfootImage coinImage = coinTemplate.getImage();
    Tuba tubaTemplate = new Tuba();
    GreenfootImage tubaImage = tubaTemplate.getImage();
    VagonetaHud hud=new VagonetaHud();
    Vagoneta vagonetaTemplate = new Vagoneta(hud);
    GreenfootImage vagonetaImage = vagonetaTemplate.getImage();
    
    Timer timer = new Timer();
    ParkingSpace parkingSpace = new ParkingSpace();
    
    private final String FILENAME="FirstLevel.txt";
    private final String PAVEMENTMARKER="X";
    private final String GRASSMARKER="G";
    private final String REDCARLEFTMARKER="R";
    private final String REDCARUPMARKER="U";
    private final String BLUECARDOWNMARKER="B";
    private final String BLUECARRIGHTMARKER="K";
    private final String YELLOWCARRIGHTMARKER="Y";
    private final String YELLOWCARUPMARKER="J";
    private final String GREYCARRIGHTMARKER="Q";
    private final String GREYCARLEFTMARKER="M";
    private final String COINMARKER="C";
    private final String VAGONETAMARKER="V";
    private final String TUBAMARKER="T";
    String[][] mapArray = new String[MAPHEIGHT][MAPWIDTH];
    
    
    public Level1() throws IOException
    {    
        setBackground("images/BackGroundStreet.png");
        
        ParkingSpaceVertical parkingSpaceVertical = new ParkingSpaceVertical();
        addObject(parkingSpaceVertical,398,130);
    
        addObject(parkingSpace,398,130);
        mapArray = readMap();
        drawPavementMap(mapArray);
        
        addObject(hud, 0, 0);
        addObject(timer, 0, 0);
        prepare();
    }
    
    public void prepare(){
        PauseButton pauseButton = new PauseButton();
        addObject(pauseButton, 30, 30);
    }
    
     public void drawPavementMap (String[][] mapArray)
    {
        int x=0;
        int y=0;
        
        for(y=0; y<mapArray.length; y++)
        {
            for(x=0; x<mapArray[y].length; x++)
            {
                if(mapArray[y][x].equals(PAVEMENTMARKER))
                {
                    int pavementX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int pavementY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new Pavement(), pavementX, pavementY);
                } else if(mapArray[y][x].equals(GRASSMARKER))
                {
                    int grassX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int grassY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new Grass(), grassX, grassY);
                }else if(mapArray[y][x].equals(REDCARLEFTMARKER))
                {
                    int redCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int redCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new RedCarLeft(), redCarX, redCarY);
                }else if(mapArray[y][x].equals(REDCARUPMARKER))
                {
                    int redCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int redCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new RedCarUp(), redCarX, redCarY);
                }else if(mapArray[y][x].equals(BLUECARDOWNMARKER))
                {
                    int blueCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int blueCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new BlueCarDown(), blueCarX, blueCarY);
                }else if(mapArray[y][x].equals(BLUECARRIGHTMARKER))
                {
                    int blueCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int blueCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new BlueCarRight(), blueCarX, blueCarY);
                }else if(mapArray[y][x].equals(YELLOWCARRIGHTMARKER))
                {
                    int yellowCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int yellowCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new YellowCarRight(), yellowCarX, yellowCarY);
                }else if(mapArray[y][x].equals(YELLOWCARUPMARKER))
                {
                    int yellowCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int yellowCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new YellowCarUp(), yellowCarX, yellowCarY);
                }else if(mapArray[y][x].equals(GREYCARLEFTMARKER))
                {
                    int greyCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int greyCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new GreyCarLeft(), greyCarX, greyCarY);
                }else if(mapArray[y][x].equals(GREYCARRIGHTMARKER))
                {
                    int greyCarX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int greyCarY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new GreyCarRight(), greyCarX, greyCarY);
                }else if(mapArray[y][x].equals(COINMARKER))
                {
                    int coinX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int coinY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new Coin(), coinX, coinY);
                }else if(mapArray[y][x].equals(TUBAMARKER))
                {
                    int tubaX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int tubaY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(new Tuba(), tubaX, tubaY);
                }else if(mapArray[y][x].equals(VAGONETAMARKER))
                {
                    int vagonetaX = x*PAVEMENTWIDTH + PAVEMENTWIDTH/2;
                    int vagonetaY = y*PAVEMENTHEIGHT + PAVEMENTHEIGHT/2;
                    addObject(herederos, vagonetaX, vagonetaY);
                    herederos.setRotation(90);
                }
            }
        }
    }
    
    public String[][] readMap() throws IOException
    {
        BufferedReader br = null;
        String [][] mArray = new String [MAPHEIGHT][MAPWIDTH];
        try{
            br = new BufferedReader(new FileReader(FILENAME));
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
