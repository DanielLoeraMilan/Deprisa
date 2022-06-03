import greenfoot.*;  

public class Tuba extends Item
{
    public Tuba(){
        setImage("images/Tuba.png");
    }
    
    public void act()
    {
        
    }
    
    public int getScore(){
        return 100;
    }
    
    public void playSound(){
        Greenfoot.playSound("SoloTuba.wav"); 
    }
}
