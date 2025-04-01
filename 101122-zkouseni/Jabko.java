import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jabko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jabko extends Actor
{
    public Jabko()
    {
        int otoceni = Greenfoot.getRandomNumber(360);
        turn(otoceni);
    }
    
    /**
     * Act - do whatever the Jabko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if (isAtEdge())
        {
            turn(90);
        }
    }    
}
