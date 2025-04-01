import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        for (int i = 0; i < 5; i++)
        {
            int randomPoziceX = Greenfoot.getRandomNumber(getWidth()+100);
            int randomPoziceY = Greenfoot.getRandomNumber(getHeight()-300);
            addObject (new Kamen(), randomPoziceX, randomPoziceY);

        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Auto auto = new Auto();
        addObject(auto,getWidth()/2,350);
    }
}
