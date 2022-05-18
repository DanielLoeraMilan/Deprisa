import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vagoneta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vagoneta extends Actor
{
    /**
     * Act - do whatever the Vagoneta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveVagoneta();
    }
    
    private void moveVagoneta(){
        if(Greenfoot.isKeyDown("up")){
            move(5);
            
            if(Greenfoot.isKeyDown("left")){
                turn(-2);
            }
        
            if(Greenfoot.isKeyDown("right")){
                turn(2);
            }
        }
        
        if(Greenfoot.isKeyDown("down")){
            move(-5);
            
            if(Greenfoot.isKeyDown("left")){
                turn(2);
            }
        
            if(Greenfoot.isKeyDown("right")){
                turn(-2);
            }
        }
    }
}
