import greenfoot.*;  

public class LevelOneCompletedScreen extends World
{

    public LevelOneCompletedScreen(int score, int level)
    {    
        super(600, 400, 1); 
        
        setBackground("images/LevelCompletedScreen.png");
        
        ResumeButton resumeButton = new ResumeButton(score, level);
        
        showText("Score: "+score,300,200);
        
        addObject(resumeButton, 300,300);
    }
}
