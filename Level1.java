import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author Karla
 * @version 9/21/21
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
    }
}
