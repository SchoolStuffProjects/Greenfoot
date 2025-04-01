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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        int pozice_prvni_jablko = 50; 
        int odstup = 70; 
        int poziceJablkoX = pozice_prvni_jablko; 
        int poziceJablkoY = 200;
        while (poziceJablkoX < getWidth()) 
        { 
            addObject(new Jablko(), poziceJablkoX, poziceJablkoY); 
            poziceJablkoX += odstup; 
        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
