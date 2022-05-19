import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vagoneta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vagoneta extends Actor
{
    private int offsetX=0;
    private int offsetY=0;
    private int score;
    private VagonetaHud vagonetaHud;
    
    /**
     * Act - do whatever the Vagoneta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Vagoneta(VagonetaHud vagonetaHud){
        this.vagonetaHud = vagonetaHud;
    }
    
    public void act()
    {
        moveVagoneta();
        
        checkColissions();
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
    
    private void checkColissions(){
        Item item = (Item)getOneIntersectingObject(Item.class);
        
        if(item != null){
            getWorld().removeObject(item);
            score += item.getScore();
            vagonetaHud.setScore(score);
            
            if(getWorld().getObjects(Item.class).isEmpty()){
                offsetX=0;
                offsetY=0;
                getWorld().showText("GAME OVER",350,250);
            }
        }
    }
}
