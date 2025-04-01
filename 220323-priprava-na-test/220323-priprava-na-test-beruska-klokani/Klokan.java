import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Klokan extends Actor
{
    int pocitadlo = 0;
    public void act()
    {
        klikani();       
        pocitadlo++;
        if (pocitadlo == 50)
        {
            MyWorld.bod--;
            getWorld().removeObject(this);
        }
    }

    public void klikani()
    {
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld.bod++;
            getWorld().removeObject(this);

        }
    }

}
