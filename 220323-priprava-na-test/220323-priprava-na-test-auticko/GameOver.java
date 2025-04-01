import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameOver extends Actor
{
    
    public void act()
    {
        GreenfootImage obrazekGameOver = new GreenfootImage ("Game Over", 30, Color.RED, Color.BLACK);
        setImage(obrazekGameOver);
    }
}
