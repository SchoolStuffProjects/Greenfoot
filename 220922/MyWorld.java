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
        
        Zaba zaba = new Zaba(); //proměnná, naźev: zaba, datový typ: Zaba
        this.addObject(zaba, 150, 150);
        
        Mucha mucha = new Mucha(); //proměnná, naźev: zaba, datový typ: Zaba
        this.addObject(mucha, 350, 350);
        
        
        
       
    }
}
