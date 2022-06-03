import greenfoot.*;  

public class GreyCarRight extends ParkedCar
{
    public void act()
    {
        setImage("images/GreyCarRight.png");
        
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm1.wav"); 
    }
}
