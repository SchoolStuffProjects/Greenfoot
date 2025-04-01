import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class Player extends Actor
{
    int hp = 5;

    public void act()
    {
        moveAroundAndAnimation();
        hp();
        castSpell();
        playTime();
    }
    
    public void moveAroundAndAnimation()
    {
        int posunX = 0, posunY = 0;
        int x = getX(), y = getY();
        int width = getWorld().getWidth(), height = getWorld().getHeight();
        if(Greenfoot.isKeyDown("D")){
            posunX += 6;
            this.setImage("CharRight.png");
        } 
        if(Greenfoot.isKeyDown("A")){
            posunX -= 6;
            this.setImage("CharLeft.png");
        } 
        if(Greenfoot.isKeyDown("W")){
            posunY -= 6;
        }
        if(Greenfoot.isKeyDown("S")){
            posunY += 6;
        }
        if(x < 100) x = 100;
        if(x > width-100) x = width-100;
        if(y < 100) y = 100;
        if(y > height-100) y = height-100;
        this.setLocation(x+posunX, y+posunY);
    }
    
    int playTime = 7200;
    public void playTime()
    {
        if(playTime > 0)
        {
            playTime--;
            getWorld().showText("Time remaining: " + playTime/60, getWorld().getWidth()/2, getWorld().getHeight()-675);
        }
        if (playTime == 0 && hp > 0)
        {
            VictoryScreen Victory = new VictoryScreen();
            Greenfoot.setWorld(Victory);
            ((MyWorld)getWorld()).stopped();
        }
        if (hp == 0)
        {
            DeathScreen Death = new DeathScreen();
            Greenfoot.setWorld(Death);
            ((MyWorld)getWorld()).stopped();
        }
    }
    
    int cooldown = 1800;
    public void castSpell()
    {
        if(cooldown > 0)
        {
            cooldown--;
        }
        if(cooldown == 0)
        {
            getWorld().showText("Spell cooldown - READY", getWorld().getWidth()-120, getWorld().getHeight()-20);
        } 
        else 
        {
            getWorld().showText("Spell cooldown " + cooldown/60, getWorld().getWidth()-120, getWorld().getHeight()-20);
        }
        String key = Greenfoot.getKey();
        GreenfootSound spellSound = new GreenfootSound("Spell.wav");
        if ("q" .equals(key) && cooldown == 0)
        {
            cooldown = 1800;
            spellSound.play();
            spellSound.setVolume(7);
            Spell spell = new Spell();
            this.getWorld().addObject(spell, this.getX(), this.getY());
        }
    }
    
    public void hp()
    {
        if(isTouching(Monster.class)) 
        {
            hp -= 1; removeTouching(Monster.class);
        }
        if(isTouching(MonsterRanged.class)) 
        {
            hp -= 1; removeTouching(MonsterRanged.class);
        }
        if(isTouching(Bullet.class)) 
        {
            hp -= 1;removeTouching(Bullet.class);
        }
        GreenfootSound heal = new GreenfootSound("Heal.wav");
        if(isTouching(Shroom.class) && (hp < 5)) 
        {
            heal.play();
            heal.setVolume(35);
            hp += 1; removeTouching(Shroom.class);
        }
        getWorld().showText("HP: " + hp, getWorld().getWidth()-50, 20);
    }
}
