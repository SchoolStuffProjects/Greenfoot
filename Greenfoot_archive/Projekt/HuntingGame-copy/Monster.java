import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class Monster extends Actor
{

    public Monster()
    {
        facePlayer();
    }

    public void act()
    {
        followPlayer();
        facePlayer();
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
    
    public void facePlayer() 
    {
        GreenfootImage image = new GreenfootImage("Monster.png");  
        image.scale(200, 200);
        image.mirrorVertically();
        setImage(image);
        turn(180);
    }

    public void followPlayer()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        turnTowards(player.getX(),player.getY());
        move(2);
    }
}
