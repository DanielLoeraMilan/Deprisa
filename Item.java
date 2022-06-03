import greenfoot.*;  

public abstract class Item extends Actor
{
    
    public void act()
    {
        Greenfoot.playSound("CoinSound.wav"); 
    }
    
    public abstract int getScore();
    public abstract void playSound();
}
