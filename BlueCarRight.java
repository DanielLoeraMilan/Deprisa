import greenfoot.*;  

public class BlueCarRight extends ParkedCar
{
    
    public void act()
    {
        setImage("images/BlueCarRight.png");
    }
    
    public int getScore(){
        return 10;
    }
    
    public void playAlarm(){
        Greenfoot.playSound("alarm1.wav"); 
    }
}
