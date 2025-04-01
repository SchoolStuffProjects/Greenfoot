import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CernyPanacek cernyPanacek = new CernyPanacek();
        addObject(cernyPanacek,163,97);
        MalyPanacek malyPanacek = new MalyPanacek();
        addObject(malyPanacek,312,151);
        CernyPanacek cernyPanacek2 = new CernyPanacek();
        addObject(cernyPanacek2,189,230);
        MalyPanacek malyPanacek2 = new MalyPanacek();
        addObject(malyPanacek2,339,229);
        cernyPanacek.setLocation(175,70);
        cernyPanacek2.setLocation(251,264);
        malyPanacek.setLocation(298,67);
        malyPanacek2.setLocation(178,204);
        CernyPanacek cernyPanacek3 = new CernyPanacek();
        addObject(cernyPanacek3,89,150);
        MalyPanacek malyPanacek3 = new MalyPanacek();
        addObject(malyPanacek3,319,187);
        cernyPanacek3.setLocation(373,104);
        malyPanacek3.setLocation(169,284);
        cernyPanacek2.setLocation(308,295);
        malyPanacek2.setLocation(201,210);
        malyPanacek2.setLocation(240,183);
        malyPanacek2.setLocation(396,221);
        malyPanacek.setLocation(105,171);
        cernyPanacek.setLocation(201,50);
        malyPanacek3.setLocation(222,315);
        cernyPanacek2.setLocation(350,326);
        malyPanacek2.setLocation(336,37);
        cernyPanacek3.setLocation(65,208);
        malyPanacek.setLocation(525,158);
    }
}
