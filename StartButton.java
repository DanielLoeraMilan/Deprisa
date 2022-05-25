import greenfoot.*; 

public class StartButton extends Actor
{
    public void act()
    {
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(270,145);
        }else{
            image.scale(250,125);
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("tubaFX.wav");
            Greenfoot.setWorld(new PantallaInfo());
        }
    }
}
