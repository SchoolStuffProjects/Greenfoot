import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 700, 1); 
        int R = Greenfoot.getRandomNumber(350);
        for (int i = 0; i < 10; i++)
        {
            int randomPoziceX = Greenfoot.getRandomNumber(getWidth()*2 + R);
            int randomPoziceY = Greenfoot.getRandomNumber(getHeight());
            addObject (new Majak(), randomPoziceX, randomPoziceY);

        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Letadlo letadlo = new Letadlo();
        addObject(letadlo,getWidth()/8,getHeight()/2);
    }
}
