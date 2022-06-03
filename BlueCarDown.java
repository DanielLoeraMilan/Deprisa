import greenfoot.*; 

public class BlueCarDown extends ParkedCar
{
    public void act()
    {
        setImage("images/BlueCarDown.png");
         
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm2.wav"); 
    }
}
