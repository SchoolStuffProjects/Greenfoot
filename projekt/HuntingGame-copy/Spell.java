import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spell extends Actor
{
    
    public void act()
    {
        spell();
        orbit();
        killMonsters();
        disapearAfterTime();
    }
    
    public void giveMoney()
    {
        MyWorld World = (MyWorld) getWorld();
        World.Money();
    }
    
    public void spell()
    {
        GreenfootImage image = new GreenfootImage("Spell.png");  
        image.scale(75, 75);
        setImage(image);
    }
    
    public void orbit()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        int playerX = player.getX();
        int playerY = player.getY();
        
        turn(10); /** rychlost otáčení */
        setLocation(playerX, playerY); /** Kde bude střed okolo, kterého se bude meč odrážet */
        move(250); /** udává vzdálenost meče od středu aktéra */
    }
    
    public void killMonsters()
    {
        if (isTouching(Monster.class))
        {
            removeTouching(Monster.class);
            giveMoney();
        }
        if (isTouching(MonsterRanged.class))
        {
            removeTouching(MonsterRanged.class);
            giveMoney();
        }
    }
    
    int shootTimer;
    public void disapearAfterTime()
    {
        shootTimer = (shootTimer+1)%420;
        if (shootTimer ==0)
        {
            getWorld().removeObject(this);
        }
    }
}