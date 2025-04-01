import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class VesmirnaStanice extends Actor
{
    int stanicePocet = 0;   
    public void act() 
    {
        if (isTouching (Raketa.class))
        {
            getWorld().removeObject(this);
        }
    }    
}
