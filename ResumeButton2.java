import greenfoot.*; 
import java.io.IOException;

public class ResumeButton2 extends Actor
{
    
    public void act()
    {
        setImage("images/ResumeButton.png");
        
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(145,75);
        }else{
            image.scale(140,70);
        }
        
        
        if(Greenfoot.mouseClicked(this)){
            try{
                Greenfoot.playSound("tubaFX.wav");
                Greenfoot.setWorld(new Level3());
            }catch(IOException e){
                return;
            }
            
        }
    }
}