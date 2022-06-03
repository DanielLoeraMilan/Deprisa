import greenfoot.*;  

public class LevelTwoCompletedScreen extends World
{

    public LevelTwoCompletedScreen(int score)
    {    
        super(600, 400, 1); 
        
        setBackground("images/LevelCompletedScreen.png");
        
        ResumeButton2 resumeButton2 = new ResumeButton2();
        
        showText("Score: "+score,300,200);
        
        addObject(resumeButton2, 300,300);
    }
}
