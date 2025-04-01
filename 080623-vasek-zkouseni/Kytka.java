import greenfoot.*;

public class Kytka extends Actor
{
    int timeToLive;
    /**int timer = 0;
    public void act() 
    {
        timer++;
        if(timer > 100)
        {
            getWorld().removeObject(this);
            timer = 0;
        }
    }*/
    
    public void act()
    {
        this.timeToLive--;
        if(timeToLive < 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public Kytka(int pocetKol)
    {
        this.timeToLive = pocetKol;
    }
}
