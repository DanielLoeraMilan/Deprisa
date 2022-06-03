import greenfoot.*;

public class PantallaInicio extends World
{

    public PantallaInicio()
    {    
        super(600, 400, 1); 
        setBackground("images/desierto.jpg");
        prepare();
    }
    
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,307,302);
        RecordsButton recordsButton = new RecordsButton();
        addObject(recordsButton, 550, 350);
    }
}
