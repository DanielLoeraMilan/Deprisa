import greenfoot.*; 

public class LetsGoButton extends Actor
{
    public void act()
    {
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(200,110);
        }else{
            image.scale(180,90);
        }
        
    }
}