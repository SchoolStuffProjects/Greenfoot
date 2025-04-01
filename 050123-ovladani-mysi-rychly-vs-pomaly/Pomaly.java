import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pomaly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pomaly extends Actor
{
    /**
     * Act - do whatever the Pomaly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo  mi = Greenfoot.getMouseInfo();
        if (mi != null) 
        {
            int mysX = mi.getX();
            int mysY = mi.getY();
            this.turnTowards(mysX, mysY);
            this.move(2);
        }    
    }
}