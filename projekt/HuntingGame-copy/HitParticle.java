import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** Při švihu mečem/ útoku se objeví ve světě a je zodpovědný za zabití nepřítele. */
public class HitParticle extends Actor
{
    
    public void act()
    {
        kill();
        despawnTime();
    }
    
    private GreenfootSound coinClank = new GreenfootSound("CoinClank.wav");
    public void kill()
    {
        if(isTouching(MonsterRanged.class)) 
        {
            coinClank.play();
            coinClank.setVolume(35);
            removeTouching(MonsterRanged.class);
            giveMoney();
        }
        if(isTouching(Monster.class)) 
        { 
            coinClank.play();
            coinClank.setVolume(35);
            removeTouching(Monster.class);
            giveMoney();
        }
    }
    
    int despawnTimer = 1;
    public void despawnTime()
    {
        despawnTimer = (despawnTimer+1)%10;
        if (despawnTimer ==0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void giveMoney()
    {
        MyWorld World = (MyWorld) getWorld();
        World.Money();
    }
    
    
}
