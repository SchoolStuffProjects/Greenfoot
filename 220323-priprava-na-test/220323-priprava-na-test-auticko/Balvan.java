import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Balvan extends Actor
{
    /**
     * Act - do whatever the Balvan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        kamenPohyb();
    }
    
    public void kamenPohyb()
    {
        setLocation (getX(), getY() + 5);
        
    }
}
