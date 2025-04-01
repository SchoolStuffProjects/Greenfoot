import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    static int bod = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        bod=0;
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2)pridejFigurku();
        showText("Body: " + bod, 50, 30);
    }

    public void pridejFigurku()
    {
        addObject (new Klokan(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getWidth()));
    }
}
