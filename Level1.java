import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667F;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL =Level2.class;
    
    public Level1()
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
        addObject(door,1171,140);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);

        addObject(player,96,750);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(),475, 650);
        addObject(new BrickWall(), 207, 496);
        addObject(new BrickWall(), 960, 196);
        addObject(new Bomb(GRAVITY), 455, 114);
        addObject(new Bomb(GRAVITY), 1060, 544);
        addObject(new Gem(), 975, 160);
        addObject(new Gem(), 1030, 160);
        addObject(new RotatedBrickWall(),730, 429);
        BrickWall brickWall4 = new BrickWall();
        addObject(brickWall4,479,195);
        brickWall4.setLocation(579,195);
        SmBrickWall smBrickWall5 = new SmBrickWall();
        addObject(smBrickWall5,124,341);
        removeObject(smBrickWall5);
        BrickWall brickWall5 = new BrickWall();
        addObject(brickWall5,471,347);

        
        removeObject(smBrickWall5);
    }
    
    private void spawn()
    {
          if(Math.random() < 0.0025)
        {
        addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber (1200), -30);
        }
    }
}
