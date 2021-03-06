import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author Karla
 * @version 9/21/21
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("edm.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.8f;
    private final int MAX_HEALTH = 3;
    private  final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */

    public Level2()
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
        addObject(new SmBrickWall(),150 , 650);
        addObject(new SmBrickWall(), 1025 , 650 );
        addObject(new BrickWall(), 550 , 550 );
        addObject(new BrickWall(), 75, 400);
        addObject(new SmBrickWall(),500 , 300);
        addObject(new SmBrickWall(),750 , 350);
        addObject(new SmBrickWall(),950 , 250);
        addObject(new SmBrickWall(),250, 225);
        addObject(new BrickWall(), 600, 100);
        addObject(new BrickWall(), 750, 100);
        addObject(new SmBrickWall(), 1150, 185);
        addObject(new Bomb(GRAVITY), 950, 210);
        addObject(new Bomb(GRAVITY),200,510);
        addObject(new Powerup(), 500, 270);
        addObject(new TrapDoor(GRAVITY), 200, 550);
        addObject(new TrapDoor(GRAVITY), 950, 650);
        addObject(new Collectible(), 25, 365);
        Player1 player1 = new Player1(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
        addObject(player1,34,760);
        player1.setLocation(54,690);

    }
    
    private void spawn()
    { 

        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200),   -30);
        }
    }
       
}
