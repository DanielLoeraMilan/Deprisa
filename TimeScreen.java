import greenfoot.*;  

public class TimeScreen extends World
{
    LeaveButton leaveButton = new LeaveButton();
    
    public TimeScreen()
    {    
        super(600, 400, 1); 
        addObject(leaveButton, 300,300);
    }
}
