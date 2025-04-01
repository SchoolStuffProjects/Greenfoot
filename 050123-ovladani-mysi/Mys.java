import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mys extends Actor
{
    public void act() 
    {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if (mouseInfo !=null)
        {
            //příklad:
            setLocation(mouseInfo.getX(), mouseInfo.getY());
            
            //další příklad: napiš mouseInfo. a klikni Ctrl + Space
        }
    }    
}
