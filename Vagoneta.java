import greenfoot.*;


public class Vagoneta extends Actor
{
    public boolean carCollisionFlag = false;
    
    private int offsetX=0;
    private int offsetY=0;
    private int direction;
    private static int score;
    private int level;
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
    
    public void setScore(int score){
        this.score = score;
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
        checkPavementCollisions(currentX, currentY);
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
    
    private void checkPavementCollisions(int currentX, int currentY){
        Pavement pavement = (Pavement)getOneIntersectingObject(Pavement.class);
        
        if(pavement != null){
            setLocation(currentX, currentY);
        }
    }
    
    private void checkParkingSpace(int currentX, int currentY){
        Timer timer = new Timer();
        
        
        if(currentX >= 345 && currentX <= 355 && currentY >= 470 && currentY <= 480){
            setLocation(currentX, currentY);
            if(getWorld() instanceof Level1){
                level = 0;
            } else if(getWorld() instanceof Level2){
                level = 1;
            }else if(getWorld() instanceof Level3){
                level = 2;
            }
            Greenfoot.setWorld(new LevelOneCompletedScreen(score,level));
        }
    }
    
}
