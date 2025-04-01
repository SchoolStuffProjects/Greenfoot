import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackToMenuButton extends Actor
{
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            ((DeathScreen)getWorld()).stopped();
            MainMenu Main = new MainMenu();
            Greenfoot.setWorld(Main);
        }
    }
}
