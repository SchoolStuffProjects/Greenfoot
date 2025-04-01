import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Beruska extends Actor
{

    public void act()
    {
        pohyb();
        sazeni();
    }

    public void pohyb()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            setLocation (mi.getX(), mi.getY());
        }

    }

    public void sazeni(){
        String klavesa = Greenfoot.getKey();

        if ("space".equals(klavesa))
        {
            this.getWorld().addObject(new Kvetina(), getX(), getY());
        }

    }
}
