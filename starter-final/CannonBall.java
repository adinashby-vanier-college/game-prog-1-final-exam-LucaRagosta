// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Activate the eating (killing) of the ladybug and transitions to a loss
     */
    public void act()
    {
        eatLadybug();
        if (isGameLost()) {
            transitionToGameOver();
        }
    }

    /**
     * If the LadyBug interacts with the cannonball, then it dissapears and causes the game to end
     */
    public void eatLadybug()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
        }
    }

    /**
     * makes it so that if the game cannon return the ladybug it gives out a loss
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions the world to a game over screen
     */
    public void transitionToGameOver()
    {
        World lobsterWorld = getWorld();
        lobsterWorld.stopped();
        World gameOverWorld =  new  GameOverWorld();
        gameOverWorld.started();
        Greenfoot.setWorld(gameOverWorld);
    }
}
