
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letadlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letadlo extends Actor
{
    public Letadlo()
    {
        

    
    
    }
    /**
     * Act - do whatever the Letadlo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("w"))
        {
            move(3);
        }
       
        if (Greenfoot.isKeyDown("s"))
        {
            move(-3);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }
    
    
    
    
    
    }    
}
