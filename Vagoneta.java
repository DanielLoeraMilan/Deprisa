import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vagoneta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vagoneta extends Actor
{
    private static final int UP=0;
    private static final int DOWN=1;
    private static final int LEFT=2;
    private static final int RIGHT=3;
    
    public boolean carCollisionFlag = false;
    
    private int offsetX=0;
    private int offsetY=0;
    private int direction;
    //private static int colissionTimer=18000;
    private int score;
    private VagonetaHud vagonetaHud;
    
    /**
     * Act - do whatever the Vagoneta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Vagoneta(VagonetaHud vagonetaHud){
        this.vagonetaHud = vagonetaHud;
        setImage("images/Vagoneta.png");
    }
    
    public void act()
    {
        moveVagoneta();
        
        checkItemCollisions();
    }
    
    private void moveVagoneta(){
        int currentX=getX();
        int currentY=getY();
        
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
        
        checkCarCollisions(currentX, currentY);
        
        //ParkedCar car = getCarOnTheWay();
        /*ParkedCar parkedCar = (ParkedCar)getOneIntersectingObject(ParkedCar.class);

        if(parkedCar != null){
            setLocation(currentX, currentY);
        }*/
        
        
    }
    
    private void checkItemCollisions(){
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
    
    private void checkCarCollisions(int currentX, int currentY){
        ParkedCar parkedCar = (ParkedCar)getOneIntersectingObject(ParkedCar.class);
        
        if(parkedCar != null){
            if(carCollisionFlag == false){
               score -= parkedCar.getScore(); 
               vagonetaHud.setScore(score);
               carCollisionFlag = true;
            }
            setLocation(currentX, currentY);
        }else{
            carCollisionFlag = false;
        }
    }
    
    private ParkedCar getCarOnTheWay(){
        switch(direction){
            case UP:
                return (ParkedCar)getOneObjectAtOffset(0,-90,ParkedCar.class);
            case DOWN:
                return (ParkedCar)getOneObjectAtOffset(0,90,ParkedCar.class);
            case RIGHT:
                return (ParkedCar)getOneObjectAtOffset(90,0,ParkedCar.class);
            case LEFT:
                return (ParkedCar)getOneObjectAtOffset(-90,0,ParkedCar.class);
        }

        return null;
    }
}
