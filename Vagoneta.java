import greenfoot.*;


public class Vagoneta extends Actor
{
    
    
    public boolean carCollisionFlag = false;
    
    private int offsetX=0;
    private int offsetY=0;
    private int direction;
    private int score;
    private VagonetaHud vagonetaHud;
    
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
        checkParkingSpace(currentX, currentY);
    }
    
    private void checkItemCollisions(){
        Item item = (Item)getOneIntersectingObject(Item.class);
        
        if(item != null){
            getWorld().removeObject(item);
            score += item.getScore();
            vagonetaHud.setScore(score);
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
    
    private void checkParkingSpace(int currentX, int currentY){
        Timer timer = new Timer();
        
        if(currentX >= 304 && currentX <= 314 && currentY >= 347 && currentY <= 353){
            timer.setTime();
            setLocation(currentX, currentY);
            getWorld().showText("GAME OVER",300,200);
        }
    }
    
}
