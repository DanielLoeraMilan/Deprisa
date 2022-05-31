import greenfoot.*;  

public class Timer extends Actor
{
    private int time = 20;
    private int count = 65;
    
    public void act()
    {
        if(time == 0){
            Greenfoot.setWorld(new TimeScreen());
        }
        
        if(counter()){
            time--;
            count = 65;
        }
        display();
    }
    
    private boolean counter(){
        if(count > 0){
            count--;
        }
        return count == 0;
    }
    
    private void display(){
        getWorld().showText("" + time, 50, 350);
    }
    
    public void setTime(){
        time = 20;
    }
}
