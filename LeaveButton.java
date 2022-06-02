import greenfoot.*; 

public class LeaveButton extends Actor
{
    public void act()
    {
        setImage("images/LeaveButton.png");
        
        GreenfootImage image = getImage();
        
        //getWorld().showText("Se terminó el tiempo",300,200);
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(145,75);
        }else{
            image.scale(140,70);
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("tubaFX.wav");
            Greenfoot.setWorld(new PantallaInicio());
        }
    }
}
