import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Medved extends Actor
{
    int hlad = 0;
    int pocitadlo = 0;
    
    public boolean jeHladovy()
    {
        //if (hlad >= 7) return true;
        //else return false;
        
        return hlad >= 7;
    }
    
    public void act()
    {
        pocitadlo++;
        if (pocitadlo >= 50)
        {
            if (hlad < 7) hlad++;
            pocitadlo = 0;
        }
        
        if (jeHladovy()) setImage("pokus.png");
        else setImage ("wombat.png");
    }
}
