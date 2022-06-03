import greenfoot.*; 

public class LeaveButton extends Actor
{
    
    public void act()
    {
        setImage("images/LeaveButton.png");
        
        GreenfootImage image = getImage();
        
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
