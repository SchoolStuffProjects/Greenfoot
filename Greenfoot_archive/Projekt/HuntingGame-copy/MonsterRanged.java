import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor; 
import java.util.List;
import java.util.ArrayList;

public class MonsterRanged extends Actor
{   
    public MonsterRanged()
    {
        GreenfootImage image = new GreenfootImage("MonsterRanged.png");  
        image.scale(100, 100);
        setImage(image);
    }
    
    public void act()
    {
        facePlayer();
        followPlayer();
        shoot();
        rangeManagement();
        rangeAttack();
    }
    
    int attackRange = 400;
    public void rangeAttack()
    {
        List<Player>allActorsDelete = getObjectsInRange(attackRange, Player.class);
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if (allActorsDelete.size() != 0 && Greenfoot.mouseClicked(null) && mouseInfo !=null)
        {
            HitParticle HitParticle = new HitParticle();
            getWorld().addObject(HitParticle, mouseInfo.getX(), mouseInfo.getY());
            for(Player player : allActorsDelete)
            {
                GreenfootImage playerImage = new GreenfootImage("Attack.png");
                player.setImage(playerImage);
                if(getX()<player.getX()) playerImage.mirrorHorizontally();
            }
        }
    }
    
    int distance = 420;
    int moveSpeed = 2;
    public void rangeManagement()
    {
        List<Player>Player = getObjectsInRange(distance, Player.class);
        if (Player.size() == 0)
        {
            move(moveSpeed);
        }
    }
    
    public void facePlayer()
    {
        GreenfootImage image = new GreenfootImage("MonsterRanged.png");  
        image.scale(100, 100);
        setImage(image);
    }
    
    public void followPlayer()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        turnTowards(player.getX(),player.getY());
    }
    
    int shootTimer;
    public void shoot()
    {
        GreenfootSound shoot = new GreenfootSound("Shoot.wav");
        shootTimer = (shootTimer+1)%300;
        if (shootTimer ==0)
        {
            shoot.play();
            shoot.setVolume(50);
            this.getWorld().addObject(new Bullet(getRotation()), getX(), getY());
        }
    }
}
