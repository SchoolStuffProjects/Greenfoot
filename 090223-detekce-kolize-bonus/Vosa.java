import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vosa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vosa extends Actor
{
    /**
     * Act - do whatever the Vosa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi !=null)
        {
            setLocation(mi.getX(), mi.getY());
        }
    }    
}
