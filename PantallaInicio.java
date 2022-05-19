import greenfoot.*;

public class PantallaInicio extends World
{

    public PantallaInicio()
    {    
        
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        inicioButton inicioButton = new inicioButton();
        addObject(inicioButton,307,302);
    }
}
