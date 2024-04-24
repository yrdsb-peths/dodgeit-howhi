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
            //Ad a gameover symbol
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetArachnid()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
