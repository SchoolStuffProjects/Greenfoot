import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * „Jablko nepadá daleko od stromu“. 
 * @Jan Kalisz (your name) 
 */
public class Padajici_Jablko extends Actor
{
    int rychlost = 10;
    public void act() 
    {
        
        this.posunse();
        if (isAtEdge())
        {
            setLocation(0,200);
        }
    }    
    public void posunse()
    {
        move(rychlost);
    }
    public void Padajici_Jablko()
    {
        turn(180);
    }
}
