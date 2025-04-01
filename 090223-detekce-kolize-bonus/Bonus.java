import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonus extends Actor
{
    public void act() 
    {
        if (isTouching(Vosa.class))
        {
            MyWorld svet = (MyWorld) getWorld();
            svet.prictiBod();
            this.getWorld().removeObject(this);
        }
    }    
}
