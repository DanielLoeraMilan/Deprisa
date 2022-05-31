import greenfoot.*;  
public class PauseScreen extends World
{
    public PauseScreen()
    {    
        super(500, 300, 1);
        setBackground("images/PauseScreen.png");
        addObject(new LeaveButton(), 250, 150);
    }
}
