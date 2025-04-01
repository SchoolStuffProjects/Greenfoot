import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** V tomto světe se hráč objeví na začátku hry a má z něj možnost hru začít. */
public class MainMenu extends World
{
    private GreenfootSound  mainSong = new GreenfootSound("MainMenuSong.mp3");
    public MainMenu()
    {    
        super(1200, 900, 1);
        
        StartButton Start = new StartButton();
        addObject(Start, getWidth()/2 +15, getHeight()-163);
        
        mainSong.setVolume(7);
        mainSong.play();
        started(); 
        stopped();
    }   
    
    public void act()
    {
        mainSong.setVolume(7);
        mainSong.play();
    }
    
    public void started()    
    {    
        mainSong.playLoop();    
    }    
 
    public void stopped()    
    {    
        mainSong.stop();    
    }   
    
    
}
