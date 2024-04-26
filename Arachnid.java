import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arachnid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arachnid extends Actor
{
    /**
     * Act - do whatever the Arachnid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        
        if(getX() <= 0)
        {
            resetArachnid();
        }
        
        if(isTouching(Hero.class))
        {
            //Add a gameover symbol
            YouLost youLost = new YouLost();
            getWorld().addObject(youLost, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetArachnid()
    {
        //Changed Location of Arachnid to match Hero's
        //Changed getRandomNumber range
        int num = Greenfoot.getRandomNumber(3);
        if(num == 0 || num == 3)
        {
            setLocation(500, 100);
        }
        else
        {
            setLocation(500, 350);
        }
    }
}
