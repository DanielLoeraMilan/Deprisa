import greenfoot.*; 

public class RedCarLeft extends ParkedCar
{
    public void act()
    {
        setImage("images/RedCarLeft.png");  
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm2.wav"); 
    }
}
