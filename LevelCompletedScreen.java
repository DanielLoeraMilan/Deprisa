import greenfoot.*;  

public class LevelCompletedScreen extends World
{

    public LevelCompletedScreen(int score)
    {    
        super(600, 400, 1); 
        
        setBackground("images/LevelCompletedScreen.png");
        
        ResumeButton resumeButton = new ResumeButton();
        
        showText("Score: "+score,300,200);
        
        addObject(resumeButton, 300,300);
    }
}
