import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    private void prepare()
    {
        Beruska beruska = new Beruska();
        addObject(beruska,getWidth()/2,getHeight()/2);
    }
}
