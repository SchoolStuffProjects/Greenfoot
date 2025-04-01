import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kvetina extends Actor
{

    public void act()
    {

    }

    public void nastaveniVelikosti(int novaVelikost)
    {
        GreenfootImage img = this.getImage();
        img.scale(novaVelikost, novaVelikost);
        this.setImage(img);
    }

    public Kvetina()
    {
        nastaveniVelikosti(Greenfoot.getRandomNumber(101)+20);
    }
}
