import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Micek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Micek extends Actor
{
    /**
     * Act - do whatever the Micek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if (isAtEdge())
        {
            turn(90);
        }
    }    
    public Micek()
    {
        GreenfootImage image = getImage();  
        image.scale(15, 15);
        setImage(image);
    }
    }

