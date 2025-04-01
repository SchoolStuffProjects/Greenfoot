import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pokeball extends Actor
{
    public void act() 
    {
        move(3);
        if (isAtEdge())
        {
            MyWorld svet = (MyWorld) getWorld();
            this.getWorld().removeObject(this);
        }
    }
    public Pokeball(int otoceni)
    {
        setRotation(otoceni);
    }
}
