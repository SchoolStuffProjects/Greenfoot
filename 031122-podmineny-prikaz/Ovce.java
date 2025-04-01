
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ovce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ovce extends Actor
{
    /**
     * Act - do whatever the Ovce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       move(7);
       
       if (isAtEdge())
       {
           setLocation(0,200);
       }
      
    }    
}
