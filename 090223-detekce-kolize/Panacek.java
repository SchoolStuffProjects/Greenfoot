import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panacek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panacek extends Actor
{
    /**
     * Act - do whatever the Panacek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi !=null)
        {
            setLocation(mi.getX(), mi.getY());
        }
        if(this.isTouching(Kamen.class))
        {
            System.out.println("GAME OVER");
        }
    }
}
