import greenfoot.*; 

public class GreyCarLeft extends ParkedCar
{    
    public void act()
    {
        setImage("images/GreyCarLeft.png");
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm3.wav"); 
    }
}
