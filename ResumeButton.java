import greenfoot.*; 
import java.io.IOException;

public class ResumeButton extends Actor
{
    private static int level;
    private int score;
    
    public ResumeButton(int score){
        this.score=score;
    }
    
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
                switch(level){
                    case 0:
                        level= level+1;
                        Greenfoot.setWorld(new Level2());
                        break;
                    case 1:
                        level= level+1;
                        Greenfoot.setWorld(new Level3());
                        break;
                    case 2:
                        level= level+1;
                        Greenfoot.setWorld(new LevelThreeCompletedScreen(score));
                        break;
                    default:
                        level=0;
                    }
            }catch(IOException e){
                return;
            }
            
        }
    }
}
