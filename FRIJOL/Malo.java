import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Malo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Malo extends Actor
{
    /**
     * Act - do whatever the Malo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World w = getWorld();
        move(-5);
        eat();
        if(isAtEdge())
        {
            //w.removeObject(this);
            setLocation(1200, getY());
        }
    }
        public void eat ()
    {
        Actor CAT;
        CAT = getOneObjectAtOffset(0, 0, CAT.class);
        if (CAT !=null)
        {
            World world;
            world = getWorld();
            world.removeObject(CAT);
            Greenfoot.playSound("MUERE.mp3");

        }
    
    }
    }

