import greenfoot.*;  
public class GameRecord extends Actor
{
    private String name;
    private int score;
    
    public void act()
    {
        
    }
    
    public GameRecord(){
        
    }
    
    public GameRecord(String name, int score){
        this.name=name;
        this.score=score;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
}
