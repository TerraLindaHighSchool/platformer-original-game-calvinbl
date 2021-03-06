import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Level2 extends World
{
    private final float GRAVITY = 0.0667F;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL =Level2.class;
    
    public Level2()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1171,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);

        addObject(player,96,750);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(),380, 500);
        
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(), 1120, 600);
        addObject(new SmBrickWall(), 880, 600);
        
        addObject(new SmBrickWall(),1000, 200);
        
        addObject(new TrapDoor(GRAVITY), 60, 400);
        
        
    
        addObject(new Gem(), 975, 160);
        addObject(new Gem(), 1030, 160);

        
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,239,319);

        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,538,155);
        TrapDoor trapDoor = new TrapDoor(0.0667f);
        addObject(trapDoor,412,155);
    }
    
    private void spawn()
    {
          if(Math.random() < 0.0025)
        {
        addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber (1200), -30);
        }
    }
}

