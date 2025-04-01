import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MicekZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MicekZ extends Actor
{
    /**
     * Act - do whatever the MicekZ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + 3);
        if (isAtEdge())
        {
            setLocation(getX(), getY() - 400);
        }
        if (getY() <= 1)
        {
            setLocation(getX(), getY() + 5);
        }
        if (getY() <= 599)
        {
            setLocation(getX(), getY() +1);
        }
    }    

    public MicekZ()
    {
        GreenfootImage image = getImage();  
        image.scale(15, 15);
        setImage(image);
        
   }
}
