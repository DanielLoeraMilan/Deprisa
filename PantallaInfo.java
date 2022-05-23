import greenfoot.*;

public class PantallaInfo extends World
{

    /**
     * Constructor for objects of class PantallaInfo.
     * 
     */
    public PantallaInfo()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        LetsGoButton letsGoButton = new LetsGoButton();
        addObject(letsGoButton,300,340);
    }
}
