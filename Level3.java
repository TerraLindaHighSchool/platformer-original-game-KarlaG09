import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    
public class Level3 extends World
 
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
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
        addObject(new Floor2(), 600, 800);
        addObject(new BrickWall(), 150, 650);
        addObject(new BrickWall(), 500, 500);
        addObject(new BrickWall(), 525, 350);
        addObject(new BrickWall(), 175, 200);
        addObject(new SmBrickWall(), 550, 125);
        addObject(new SmBrickWall(), 100,450);
        addObject(new SmBrickWall(), 725, 200);
        addObject(new SmBrickWall(), 825, 700);
        addObject(new SmBrickWall(), 1025, 575);
        addObject(new SmBrickWall(), 900, 400);
        addObject(new SmBrickWall(), 1075, 300);
        addObject(new SmBrickWall(), 925, 200);
        addObject(new SmBrickWall(), 1150, 185);
        addObject(new Bomb(GRAVITY), 950, 210);
        addObject(new Bomb(GRAVITY),175, 550);
        addObject(new Powerup(), 43, 56);
      
        addObject(new Powerup(), 1050, 270);
        addObject(new Collectible(), 1125, 265);
        Player1 player1 = new Player1(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
        addObject(player1,34,760);
        player1.setLocation(54,690); 
    }
}
