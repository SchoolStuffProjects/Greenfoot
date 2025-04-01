import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto extends Actor
{
    /**
     * Act - do whatever the Auto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        pohyb();
    }
    
    public void pohyb()
    {
        if (Greenfoot.isKeyDown("D"))
        {
            setLocation (getX() + 4, getY());
        }
        if (Greenfoot.isKeyDown("A"))
        {
            setLocation (getX() - 4, getY());
        }
    }
}
