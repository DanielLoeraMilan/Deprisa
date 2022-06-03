import greenfoot.*; 
public class RecordsButton extends Actor
{
    public void act()
    {
        setImage("images/RecordsButton.png");
        
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(75,40);
        }else{
            image.scale(70,35);
        }
    }
}
