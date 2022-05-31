import greenfoot.*;  
public class PauseButton extends Actor
{
    public void act()
    {
        setImage("images/PauseButton.png");
        
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(45,45);
        }else{
            image.scale(40,40);
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("tubaFX.wav");
            Greenfoot.setWorld(new PauseScreen());
        }
    }
}
