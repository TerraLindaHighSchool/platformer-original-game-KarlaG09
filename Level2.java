import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
      private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompatech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
     private void prepare()
      { 
        setPaintOrder(Player1.class, Platform.class, Obstacle.class, Collectible.class, Door.class, HUD.class);
        Player1 player = new Player1(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,38,755);
        Door door = new Door();
        addObject(door,1175,128);
        player.setLocation(67,748);
        player.setLocation(71,741);
        player.setLocation(55,738);
        player.setLocation(63,741);
        player.setLocation(199,722);
        player.setLocation(443,500);
        player.setLocation(435,501);
        player.setLocation(-72,152);
        removeObject(player);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 880, 650);
        addObject(new SmBrickWall(), 250, 550);
        addObject(new BrickWall(), 550, 450);
        addObject(new SmBrickWall(), 1100, 300);
        addObject(new BrickWall(), 650, 200);
        addObject(new SmBrickWall(), 1150, 185);
        addObject(new Bomb(GRAVITY), 850, 165);
        addObject(new Bomb(GRAVITY), 1050, 770);
        addObject(new Powerup(), 43, 56);
        addObject(new TrapDoor(GRAVITY), 200, 550);
        addObject(new TrapDoor(GRAVITY), 950, 650);
        addObject(new Powerup(), 1050, 270);
        addObject(new Collectible(), 1125, 265);
        Player1 player1 = new Player1(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
        addObject(player1,34,760);
        player1.setLocation(54,690);
}
}
