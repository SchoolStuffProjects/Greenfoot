import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jablko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jablko extends Actor
{
    int pocetkroku =0;
    /**
     * Act - do whatever the Jablko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        pocetkroku++;
        move(20);
        if (pocetkroku >= 10)
        {
            pocetkroku =0;
            turn(120);
        }
    }    
}
