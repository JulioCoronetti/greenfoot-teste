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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        slimeGreen slimeGreen = new slimeGreen();
        addObject(slimeGreen,129,520);
        slimeRed slimeRed = new slimeRed();
        addObject(slimeRed,601,520);
        Counter counter = new Counter();
        addObject(counter,117,80);
        Counter2 counter2 = new Counter2();
        addObject(counter2,686,70);
    }
}
