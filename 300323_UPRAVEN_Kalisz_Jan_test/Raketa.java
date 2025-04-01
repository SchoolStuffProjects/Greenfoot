import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Raketa extends Actor
{
    public void act() 
    {
        pohyb();
    }
    
    public void pohyb()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            turnTowards(mi.getX(), mi.getY());
            move(3);
        }
    }

    public Raketa()
    {
        turn(-90);
    }
}
