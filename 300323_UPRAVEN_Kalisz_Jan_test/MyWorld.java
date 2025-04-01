import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (Jan Kalisz) 
 * @date (23.03.2023)
 */
public class MyWorld extends World
{
    public static int palivo = 0;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        palivo = 0;
        showText("KROKODÝLÍ RAMPA", 100, 590);

        Rampa rampa = new Rampa();
        addObject(rampa,100,590);
        Raketa raketa = new Raketa();
        addObject(raketa,100,550);
    }
    
    public void act()
    {
        Palivo();
        showText("Palivo: " + palivo, 50, 30);
    }
    
    public void Palivo()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            palivo++;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            palivo--;
        }
    }
    
    
    
}      