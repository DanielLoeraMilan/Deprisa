import greenfoot.*;  

public class MyWorld extends World
{
    VagonetaHud hud = new VagonetaHud();
    Timer timer = new Timer();
    
    
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
        addObject(hud,0,0);
        addObject(timer, 0, 0);
    }
    
    private void prepare()
    {
        Coin coin = new Coin();
        addObject(coin,505,54);
        Coin coin2 = new Coin();
        addObject(coin2,76,346);
        Tuba tuba = new Tuba();
        addObject(tuba,505,328);
        BlueCarDown blueCarDown = new BlueCarDown();
        addObject(blueCarDown,509,178);
        GreyCarLeft greyCarLeft = new GreyCarLeft();
        addObject(greyCarLeft,82,45);
        RedCarLeft redCarLeft = new RedCarLeft();
        addObject(redCarLeft,212,44);
        YellowCarRight yellowCarRight = new YellowCarRight();
        addObject(yellowCarRight,342,43);
        ParkingSpace parkingSpace = new ParkingSpace();
        addObject(parkingSpace,309,350);
        addObject(new Vagoneta(hud),124,192);
        PauseButton pauseButton = new PauseButton();
        addObject(pauseButton, 30, 30);
        InfoButton infoButton = new InfoButton();
        addObject(infoButton, 570, 370);
    }
}
