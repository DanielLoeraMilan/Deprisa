import greenfoot.*;

public class VagonetaHud extends Actor
{
    private static int score;
    
    public void act()
    {  
        refresh();
    }
    
    public void refresh(){
        getWorld().showText("Score: "+score,400,30);
    }
    
    public void setScore(int score){
        this.score = score;
    }
}
