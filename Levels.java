import greenfoot.*;  
public abstract class Levels extends World
{
    public VagonetaHud hud = new VagonetaHud();
    public Vagoneta herederos = new Vagoneta(hud);
    
    public Levels()
    {    
        super(700, 700, 1); 
    }
}
