import greenfoot.*;  

public class LevelThreeCompletedScreen extends World
{
    public LevelThreeCompletedScreen(int score)
    {    
        super(600, 400, 1); 
        
        setBackground("images/LevelCompletedScreen.png");
        
        
        showText("Total Score: "+score,300,200);
        
        addObject(new SaveButton(score), 300,300);

    }
}