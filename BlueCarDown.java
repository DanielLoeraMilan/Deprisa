import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCarDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCarDown extends ParkedCar
{
    /**
     * Act - do whatever the BlueCarDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("images/BlueCarDown.png");
    }
    
    public int getScore(){
        return 10;
    }
}
