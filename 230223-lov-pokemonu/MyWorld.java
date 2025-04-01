import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    
    public MyWorld()
    {
        super(1100, 700, 1); 
        prepare();
    }
    int Skore = 0;
    public void Skore()
    {
        Skore++;
        this.showText("" + Skore, 50, 50);
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) > 98)
        {
            int Tutelx = Greenfoot.getRandomNumber(getWidth());
            int Tutely = Greenfoot.getRandomNumber(getWidth());
            addObject(new Tutel(), Tutelx, Tutely);
        }
        if (Greenfoot.getRandomNumber(100) > 98)
        {
            int Krysakx = Greenfoot.getRandomNumber(getWidth());
            int Krysaky = Greenfoot.getRandomNumber(getWidth());
            addObject(new Krysak(), Krysakx, Krysaky);
        }
    }
    
    private void prepare()
    {
        Panacek panacek = new Panacek();
        addObject(panacek,300,200);
    }
}
