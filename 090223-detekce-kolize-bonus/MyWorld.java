import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int pocetBodu = 0;
    public void prictiBod()
    {
        pocetBodu++;
        this.showText("" + pocetBodu, 50, 50);
    }

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) > 95)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getWidth());
            addObject(new Bonus(), x, y);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Vosa vosa = new Vosa();
        addObject(vosa,300,200);
    }
}
