import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author Karla
 * @version 9/21/21
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectible.class,
              Door.class, HUD.class);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,38,755);
        Door door = new Door();
        addObject(door,1175,128);
        Player player2 = new Player();
        addObject(player2,92,748);
        player.setLocation(67,748);
        player.setLocation(71,741);
        player.setLocation(55,738);
        player.setLocation(63,741);
        player.setLocation(199,722);
        player.setLocation(443,500);
        player.setLocation(435,501);
        player.setLocation(-72,152);
        removeObject(player);
        player2.setLocation(40,728);
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
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200),   -30);
        }
    }
}
