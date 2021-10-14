import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
{    
private void onCollision( )
{
    if(isTouching(Door.class))
    {
        World world = null;
        try 
        {
            world = (World) NEXT_LEVEL.newInstance();
        }   
        catch (InstantiationException e) 
        {
            System.out.println("Class cannot be instantiated");
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access class constructor");
        } 
        Greenfoot.setWorld(world);
    }
}
    {        
        super(1200, 800, 1); 
    }
}