import greenfoot.*;  
import javax.swing.JOptionPane;

public class SaveButton extends Actor
{
    private int score;
    
    public SaveButton(int score){
        this.score=score;
    }
    
    public void act()
    {
        setImage("images/SaveButton.png");
        buttonPressed();
    }
    
    public void buttonPressed(){
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.scale(145,75);
        }else{
            image.scale(140,70);
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("tubaFX.wav");
            String userName=JOptionPane.showInputDialog("Escribe tu nombre: ");
            Greenfoot.setWorld(new RecordsManager(userName, score));
        }
    }
}
