import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Micek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Micek extends Actor
{
    /**
     * Act - do whatever the Micek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        
        /**this.removeTouching(Zed.class); (smazat Zeď při doteku)*/
        
        /**if (this.isTouching(Zed.class))
	{
	    turn(180);
		move(5);
	}                                  (Když se dotkne zdi otočí se o 180 stupňů*/ 
    }    
}
