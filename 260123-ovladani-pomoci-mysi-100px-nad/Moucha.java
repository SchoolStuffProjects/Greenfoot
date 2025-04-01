    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    
    public class Moucha extends Actor
    {
        
        public void act() 
        {
            /**MouseInfo mouseInfo = Greenfoot.getMouseInfo();
            if (mouseInfo != null)
            {
                setLocation(mouseInfo.getX(), mouseInfo.getY() - 100);
            }
            if(isAtEdge())
            {
                setLocation(mouseInfo.getX(), mouseInfo.getY() + 100);
            }*/
            // moje řešení
            
           MouseInfo mouseInfo = Greenfoot.getMouseInfo();
            if (mouseInfo != null)
            {
            int posX = mouseInfo.getX();
            int posY = mouseInfo.getY();
            
            if (isAtEdge())
            {
                posY += 100;
            } else
            {
                posX-= 100;
            }
            
            setLocation(posX, posY);
        }
    }    
}
