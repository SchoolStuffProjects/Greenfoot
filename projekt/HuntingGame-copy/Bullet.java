import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** Je kulka vystřelená aktérem MonsterRanged. */
public class Bullet extends Actor
{
    public void act()
    {
        move(5);
        deleteYourselfAtEdge();
    }
    
    public Bullet(int rotation)
    {
        setRotation(rotation);
        GreenfootImage image = new GreenfootImage("Bullet.png");  
        image.scale(100, 100);
        setImage(image);
    }
    
    public void deleteYourselfAtEdge()
    {
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
