import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Majak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Majak extends Actor
{
    /**
     * Act - do whatever the Majak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-3);
        
        if (isAtEdge())
        {
            this.removeTouching(Majak.class);
        }
    }    
}
