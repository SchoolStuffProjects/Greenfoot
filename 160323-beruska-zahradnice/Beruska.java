import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Beruska extends Actor
{
    
    public void act() 
    {
        move();
        zasad();
    }
    public void move()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi !=null)
        {
            turnTowards(mi.getX(),mi.getY());
            move(3);
        }
    }
    public void zasad()
    {
        String klavesa = Greenfoot.getKey();
        if ("space".equals(klavesa))
        {
            Kvetina kvetina = new Kvetina();
            this.getWorld().addObject(kvetina, this.getX(), this.getY());
        }
    }
}
