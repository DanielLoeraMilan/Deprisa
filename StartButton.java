import greenfoot.*; 

public class StartButton extends Actor
{
    public void act()
    {
        setImage("images/StartButton.png");
        
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(255,130);
        }else{
            image.scale(250,125);
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("tubaFX.wav");
            Greenfoot.setWorld(new PantallaInfo());
        }
    }
}
