import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Auto extends Actor
{
    
    public void act() 
    {
        vlevo();
        vpravo();
        smazani();
    }    
    public void vlevo()
    {
        if (Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()-2,getY());
        }
    }
    public void vpravo()
    {
        if (Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+2,getY());
        }
    }
    public void smazani()
    {
        if (isTouching(Kamen.class))
        {
            this.getWorld().removeObject(this);
        }
    }
}
