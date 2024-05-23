import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CAT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CAT extends Actor
{
    /**
     * Act - do whatever the CAT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    
    public void act()
    {
        
        w = getWorld();
        // Add your action code here.
        mover();
        shooter();
        eat();
        w.addObject(new arco(), getX() -50 , getY());
    }
    
    public void mover()
    {
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(), getY() -10 );
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(), getY() +10 );
        }
         if(Greenfoot.isKeyDown("left"))
        {
            move (-5);
        }
         if(Greenfoot.isKeyDown("right"))
        {
            move (5);
        }
    }
    public void shooter()
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new Shots(), getX(), getY());
            Greenfoot.playSound("PIU.mp3");
        }
    }
        public void eat ()
    {
        Actor musica;
        musica = getOneObjectAtOffset(0, 0, musica.class);
        if (musica !=null)
        {
            World world;
            world = getWorld();
            world.removeObject(musica);
            Greenfoot.playSound("NYA.mp3");
        }
    
    }
}
