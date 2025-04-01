import greenfoot.*;

public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        /**Akter akter = new Akter();
        addObject(akter,getWidth()/2,getHeight()/2);*/
        
        for(int i = 0; i <=10; i++)
        {
            Akter akter = new Akter();
            addObject(akter, i * getWidth()/10,getHeight()/2);
        }
    }
}

