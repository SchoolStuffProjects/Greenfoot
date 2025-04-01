import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tutel extends Actor
{
    
    public void act() 
    {
        if (isTouching(Pokeball.class))
        {
            MyWorld svet = (MyWorld) getWorld();
            svet.Skore();
            this.getWorld().removeObject(this);
        }
    }    
}
