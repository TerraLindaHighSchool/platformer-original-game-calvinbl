import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1171,44);
        Player player = new Player();
        addObject(player,96,750);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(),380, 500);
        addObject(new BrickWall(), 780, 300);
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(), 1120, 600);
        addObject(new SmBrickWall(), 880, 600);
        addObject(new SmBrickWall(),420, 160);
        addObject(new SmBrickWall(),1000, 200);
        addObject(new SmBrickWall(),220, 280);
        addObject(new TrapDoor(), 1000, 600);
        addObject(new Bomb(), 455, 114);
        addObject(new Bomb(), 1060, 544);
        addObject(new Gem(), 975, 160);
        addObject(new Gem(), 1030, 160);

    }
}
