import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** Do tohoto světa je hráč přenesen v moment když prohraje hru. */
public class DeathScreen extends World
{
    private GreenfootSound  loseSound = new GreenfootSound("DeathScreenSE.wav");
    private GreenfootSound  loseSong = new GreenfootSound("DeathScreenSong.mp3");
    public DeathScreen()
    {    
        super(1200, 900, 1);
        
        BackToMenuButton Back = new BackToMenuButton();
        addObject(Back, getWidth()/2 +15, getHeight()-163);
        
        
        loseSound.setVolume(15);
        loseSound.play();
        
        loseSong.setVolume(7);
        loseSong.play();
    }
    
    public void started()    
    {    
        loseSong.playLoop();  
    }    
 
    public void stopped()    
    {    
        loseSong.stop();    
    }   
}
