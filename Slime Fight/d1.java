import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class d1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class d1 extends World
{
    public int atraso = 25;
    /**
     * Constructor for objects of class d1.
     * 
     */
    public d1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act() {
        if(atraso > 0) {
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso < 1)){
            d2 world = new d2();
            Greenfoot.setWorld(world);
        }
    }
}
