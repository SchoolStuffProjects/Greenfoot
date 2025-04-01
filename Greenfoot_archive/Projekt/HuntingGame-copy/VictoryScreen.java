import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** Do tohoto světa je hráč přenesen v moment když vyhraje hru. Gratulujeme. */
public class VictoryScreen extends World
{
    private GreenfootSound  winSound = new GreenfootSound("VictoryScreenSE.mp3");
    private GreenfootSound  winSong = new GreenfootSound("VictoryScreenSong.mp3");
    public VictoryScreen()
    {    
        super(1200, 900, 1);
        
        BackToMenuButtonV Back = new BackToMenuButtonV();
        addObject(Back, getWidth()/2 +15, getHeight()-163);
        
        winSound.setVolume(15);
        winSound.play();
        
        winSong.setVolume(7);
        winSong.play();
        
        GreenfootImage text = new GreenfootImage("" + MyWorld.Money, 50, Color.WHITE, new Color(0, 0, 0, 0));
        getBackground().drawImage(text, (getWidth()-text.getWidth())/2 + 90, (getHeight()-text.getHeight())/2 - 100);

    }
    
    public void started()
    {    
        winSong.playLoop();  
    }    
 
    public void stopped()
    {    
        winSong.stop();    
    }
}
