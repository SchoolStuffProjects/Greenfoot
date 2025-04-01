import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** Ve světě MyWorld probíhá většina hry. */
public class MyWorld extends World
{
    final int SAFEZONE = 250;
    private GreenfootSound gameSong = new GreenfootSound("MyWorldSong.mp3");
    public MyWorld()
    {    
        super(1150, 700, 1); //1600,900,1 nebo 1150,700,1
        spawnPlayer();
        spawnMonster();
        spawnMonsterRanged();
        spawnShroom();
        spawnSpell();
        
        Money = 0;
        
        gameSong.setVolume(5);
        gameSong.play();
    }
    
    public void started()    
    {    
        gameSong.playLoop();  
    }    
 
    public void stopped()    
    {    
        gameSong.stop();    
    }   
    
    public void act()
    {
        progresiveDifficulty();
    }
    
    int spawnRateMonsters = 1;
    int increaseChanceTimer;
    /** Zvyšuje obtížnost hry (tudíž míru ve, které se budou nepřátelé objevovat)
    *   každých 40 sekund. Míra zjevování léčivých houbiček zůstává celou hru stejná.
    */
    public void progresiveDifficulty()
    {
        increaseChanceTimer++;
        if (increaseChanceTimer == 2400)
        { 
            increaseChanceTimer = 0;
            spawnRateMonsters++;
        }
        if (Greenfoot.getRandomNumber(100) < spawnRateMonsters)spawnMonster();
        if (Greenfoot.getRandomNumber(100) < spawnRateMonsters)spawnMonsterRanged();
        if (Greenfoot.getRandomNumber(100) < 1)spawnShroom();
    }
    
    public void spawnPlayer()
    {
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
    }
    
    public void spawnSpell()
    {
        String key = Greenfoot.getKey();
        if ("Q" .equals(key))
        {
            Spell spell = new Spell();
            addObject(spell, getWidth(), getHeight());
        }
    }
    
    /** Metody spawnMonster() spawnMonsterRanged() a spawnShroom jsou si ve fungování prakticky indentické. Zajišťují aby se ani nepřítel ani léčivá houbička neobjevila na stejném místě jako hráč a na okrajích
    * světa.   
    */
    public void spawnMonster()
    {
        int randomX = Greenfoot.getRandomNumber(getWidth()-200)+100;
        int randomY = Greenfoot.getRandomNumber(getHeight()-200)+100;
        Player player = getObjects(Player.class).get(0);
        if((randomX < player.getX()-SAFEZONE) || (randomX > player.getX()+SAFEZONE) || 
            (randomY < player.getY()-SAFEZONE) || (randomY > player.getY()+SAFEZONE))
        addObject (new Monster(), randomX, randomY);
    }
    
    public void spawnMonsterRanged()
    {
        int randomX = Greenfoot.getRandomNumber(getWidth()-100)+50;
        int randomY = Greenfoot.getRandomNumber(getHeight()-100)+50;
        Player player = getObjects(Player.class).get(0);
        if((randomX < player.getX()-SAFEZONE) || (randomX > player.getX()+SAFEZONE) || 
            (randomY < player.getY()-SAFEZONE) || (randomY > player.getY()+SAFEZONE))
        addObject (new MonsterRanged(), randomX, randomY);
    }
    
    public void spawnShroom()
    {  
       int randomX = Greenfoot.getRandomNumber(getWidth()-100)+50;
       int randomY = Greenfoot.getRandomNumber(getHeight()-100)+50;
       Player player = getObjects(Player.class).get(0);
       if((randomX < player.getX()-SAFEZONE) || (randomX > player.getX()+SAFEZONE) || 
          (randomY < player.getY()-SAFEZONE) || (randomY > player.getY()+SAFEZONE))
       addObject (new Shroom(), randomX, randomY);
    }
    
    public static int Money = 0;
    public void Money()
    {
        Money++;
        this.showText("Money: " + Money, 50, 20);
    }
}