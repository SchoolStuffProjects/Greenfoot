import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rychly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rychly extends Actor
{
    /**
     * Act - do whatever the Rychly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if (mouseInfo != null)
        {
            setLocation(mouseInfo.getX(), mouseInfo.getY());
            getOneIntersectingObject(null);
        }
        
        
    }
    public void Trefa()
    {
        getIntersectingObjects(null);
        
    }
}
