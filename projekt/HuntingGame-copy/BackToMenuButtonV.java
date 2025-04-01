import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackToMenuButtonV extends Actor
{
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            ((VictoryScreen)getWorld()).stopped();
            MainMenu Main = new MainMenu();
            Greenfoot.setWorld(Main);
        }
    }
}
