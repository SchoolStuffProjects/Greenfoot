import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letadlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letadlo extends Actor
{
    int rychlost = 0;
    /**
     * Act - do whatever the Letadlo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY() + 5);
        }
    }
}    

