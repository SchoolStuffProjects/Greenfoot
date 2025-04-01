import greenfoot.*;

public class Akter extends Actor
{
    
    public void act() 
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            move(3);
            turnTowards(mi.getX(), mi.getY());
        }
        
        String key = Greenfoot.getKey();
        if("space".equals(key))
        {
            getWorld().addObject(new Kytka(200), getX(), getY());
        } 
    }
}    

