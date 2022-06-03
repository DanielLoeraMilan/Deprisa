import greenfoot.*;  

public class Coin extends Item
{
    
    public Coin(){
        setImage("images/coin.png");
    }
    
    public void act()
    {
       
    }
    
    public int getScore(){
        return 20;
    }
    
    public void playSound(){
        Greenfoot.playSound("CoinSound.wav"); 
    }
}
