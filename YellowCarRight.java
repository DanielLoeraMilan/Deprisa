import greenfoot.*;

public class YellowCarRight extends ParkedCar
{
    public void act()
    {
        setImage("images/YellowCarRight.png");
        
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm1.wav"); 
    }
}
