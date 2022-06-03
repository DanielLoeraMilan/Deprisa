import greenfoot.*;  

public class LevelOneCompletedScreen extends World
{

    public LevelOneCompletedScreen(int score)
    {    
        super(600, 400, 1); 
        
        setBackground("images/LevelCompletedScreen.png");
        
        ResumeButton resumeButton = new ResumeButton(score);
        
        showText("Score: "+score,300,200);
        
        addObject(resumeButton, 300,300);
    }
}
