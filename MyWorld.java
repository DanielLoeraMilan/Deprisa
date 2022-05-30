import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    VagonetaHud hud = new VagonetaHud();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        addObject(hud,0,0);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Vagoneta vagoneta = new Vagoneta();
        
        Coin coin = new Coin();
        addObject(coin,505,54);
        Coin coin2 = new Coin();
        addObject(coin2,76,346);
        Tuba tuba = new Tuba();
        addObject(tuba,505,328);
        BlueCarDown blueCarDown = new BlueCarDown();
        addObject(blueCarDown,509,178);
        GreyCarLeft greyCarLeft = new GreyCarLeft();
        addObject(greyCarLeft,82,45);
        RedCarLeft redCarLeft = new RedCarLeft();
        addObject(redCarLeft,212,44);
        YellowCarRight yellowCarRight = new YellowCarRight();
        addObject(yellowCarRight,342,43);
        ParkingSpace parkingSpace = new ParkingSpace();
        addObject(parkingSpace,309,350);
        addObject(new Vagoneta(hud),124,192);
    }
}
