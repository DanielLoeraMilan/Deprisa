import greenfoot.*;  
public abstract class Levels extends World
{
    public static VagonetaHud hud = new VagonetaHud();
    public Vagoneta herederos = new Vagoneta(hud);
    public static GreenfootSound rokola = new GreenfootSound("DeprisaSoundTrack.wav");
    
    public Levels()
    {    
        super(700, 700, 1); 
    }
}
