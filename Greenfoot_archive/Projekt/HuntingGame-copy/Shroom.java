import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Shroom extends Actor
{
 
    public void act()
    {
        disapearAfterTime();
    }
    
    int existTimer;
    public void disapearAfterTime()
    {
        existTimer = (existTimer+1)%150;
        if (existTimer ==0)
        {
            getWorld().removeObject(this);
        }
    }
}
