import greenfoot.*;  

public class YellowCarUp extends ParkedCar
{
    public void act()
    {
        setImage("images/YellowCarUp.png");
         
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm2.wav"); 
    }
}
