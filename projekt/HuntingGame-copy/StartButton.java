import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartButton extends Actor
{
    public void act()
    {  
        if (Greenfoot.mouseClicked(this))
        {
            ((MainMenu)getWorld()).stopped();
            MyWorld Game = new MyWorld();
            Greenfoot.setWorld(Game);
        }
    }
}

