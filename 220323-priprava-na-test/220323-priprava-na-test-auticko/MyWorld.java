import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Auto auto = new Auto();
        addObject(auto,getWidth()/2,750);
    }
    
    public void act()
    {
        int spawn = Greenfoot.getRandomNumber(150);
        if (spawn <= 5)
        {
            int nahodneX = Greenfoot.getRandomNumber(840);
            Balvan balvan = new Balvan();
            addObject (balvan, nahodneX, 3);
            balvan.turn(90);
        }
    }
}
