import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Panacek extends Actor
{
    
    public void act() 
    {
        pohyb();
        hazeni();
    }  
    
    private void pohyb()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi !=null)
        {
            turnTowards(mi.getX(), mi.getY());
            move(3);
        }
    }
    
    private void hazeni()
    {
        String klavesa = Greenfoot.getKey();
        if ("space".equals(klavesa))
        {
            int otoceni = getRotation();
            Pokeball pokeball = new Pokeball(otoceni);
            getWorld().addObject(pokeball, getX(), getY());
        }
    }
}
