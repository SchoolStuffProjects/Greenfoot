import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zelva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zelva extends Actor
{
   /**int X = 0;
   //int Y = 0;*/
   private int rychlost = 5;
    
   private void pohyb()
    {
        int pohybX = 0, pohybY = 0;
        
        if (Greenfoot.isKeyDown("A"))  pohybX -= 1; 
        if (Greenfoot.isKeyDown("D")) pohybX += 1; 
        if (Greenfoot.isKeyDown("W"))    pohybY -= 1;
        if (Greenfoot.isKeyDown("S"))  pohybY += 1;
        
        int novaX = getX() + pohybX*rychlost;
        int novaY = getY() + pohybY*rychlost;
        
        setLocation(novaX, novaY);
        
    }
   private void testSpusteniakce()
    {
        if ("enter".equals(Greenfoot.getKey()))
        {
            getWorld().addObject(new Banan(), getX(), getY());
        }
    }
   public void act() 
    { 
        pohyb();
        testSpusteniakce();
        
        /**if (Greenfoot.isKeyDown("w"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }*/
        
        
        /**int posunX = 0, posunY = 0;
        
        if (Greenfoot.isKeyDown("left"))  posunX -= 3; 
        if (Greenfoot.isKeyDown("right")) posunX += 3; 
        if (Greenfoot.isKeyDown("up"))    posunY -= 3;
        if (Greenfoot.isKeyDown("down"))  posunY += 3;
        this.setLocation(this.getX()+posunX, this.getY()+posunY);*/
    }    
}
