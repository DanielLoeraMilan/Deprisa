import greenfoot.*;  
public class PauseButton extends Actor
{
    public void act()
    {
        setImage("images/PauseButton.png");
        boolean pauseFlag = false;
        
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(45,45);
        }else{
            image.scale(40,40);
        }
        
        if(Greenfoot.mouseClicked(this) && pauseFlag==false){
            Greenfoot.playSound("tubaFX.wav");
            Greenfoot.delay(300);
            pauseFlag=true;
        }
        
        if(Greenfoot.mouseClicked(this) && pauseFlag==true){
            Greenfoot.start();
        }
    }
}
