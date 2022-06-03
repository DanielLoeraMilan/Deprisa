import greenfoot.*;

public class ControlsScreen extends World
{
    public ControlsScreen()
    {    
        super(600, 400, 1); 
        setBackground("Controls.jpg");
        prepare();
        
    }
    
    private void prepare()
    {
        LetsGoButton2 letsGoButton = new LetsGoButton2();
        addObject(letsGoButton,300,360);
    }
}
