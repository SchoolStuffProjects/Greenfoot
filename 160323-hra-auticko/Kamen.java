import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kamen extends Actor
{
    
    public void act() 
    {
        setLocation(getX(),getY()+3);
        if (isAtEdge())
        {
            setLocation(getX(),50);
        }
        
    }    
}
