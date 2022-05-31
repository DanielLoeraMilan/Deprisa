import greenfoot.*;  
public class InfoButton extends Actor
{
    public void act()
    {
        setImage("images/InfoButton.png");
        
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(45,45);
        }else{
            image.scale(40,40);
        }
    }
}
