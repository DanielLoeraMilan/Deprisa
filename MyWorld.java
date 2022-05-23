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
        addObject(new Vagoneta(hud),124,192);
        Coin coin = new Coin();
        addObject(coin,505,54);
        Coin coin2 = new Coin();
        addObject(coin2,76,346);
        Tuba tuba = new Tuba();
        addObject(tuba,505,328);
    }
}
