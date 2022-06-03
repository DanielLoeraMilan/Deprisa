import greenfoot.*;  

public class RedCarUp extends ParkedCar
{
    public void act()
    {
        setImage("images/RedCarUp.png");
        
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm3.wav"); 
    }
}
