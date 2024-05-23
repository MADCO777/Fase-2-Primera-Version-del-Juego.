import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Espacio extends World
{

    /**
     * Constructor for objects of class Espacio.
     * 
     */
    public Espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 500, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CAT cAT = new CAT();
        addObject(cAT,27,241);
        Malo malo = new Malo();
        addObject(malo,1174,29);
        Malo malo2 = new Malo();
        addObject(malo2,1149,92);
        Malo malo3 = new Malo();
        addObject(malo3,1127,155);
        Malo malo4 = new Malo();
        addObject(malo4,1108,227);
        Malo malo5 = new Malo();
        addObject(malo5,837,250);
        Malo malo6 = new Malo();
        addObject(malo6,886,367);
        Malo malo7 = new Malo();
        addObject(malo7,910,426);
        Malo malo8 = new Malo();
        addObject(malo8,946,477);

        Malo malo9 = new Malo();
        addObject(malo9,949,107);
        Malo malo10 = new Malo();
        addObject(malo10,703,39);
        Malo malo11 = new Malo();
        addObject(malo11,740,462);
        Malo malo12 = new Malo();
        addObject(malo12,297,176);
        Malo malo13 = new Malo();
        addObject(malo13,534,93);
        Malo malo14 = new Malo();
        addObject(malo14,1197,219);
        Malo malo15 = new Malo();
        addObject(malo15,1062,63);
        Malo malo16 = new Malo();
        addObject(malo16,1027,170);
        Malo malo17 = new Malo();
        addObject(malo17,838,442);
        Malo malo18 = new Malo();
        addObject(malo18,786,364);
        musica musica = new musica();
        addObject(musica,77,242);
    }
}
