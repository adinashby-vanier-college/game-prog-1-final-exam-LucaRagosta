// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FinishLocation extends Actor
{

    /**
     * make it so that when the ladybug touches the finishlocation it removes it and initializes a gamewon screen
     */
    public void act()
    {
        eatLadybug();
        if (isGameWon()) {
            transitionToGameWon();
        }
    }

    /**
     * this removes the ladybug from the map
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
     * this checks to see if there is a ladybug on the map. If there isnt, then it sets the boolean value to true, leading to the game won screen
     */
    public boolean isGameWon()
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
     * Transitions the game to the gamewon screen
     */
    public void transitionToGameWon()
    {
        World lobsterWorld = getWorld();
        lobsterWorld.stopped();
        World gameOverWorld =  new  GameWonWorld();
        gameOverWorld.started();
        Greenfoot.setWorld(gameOverWorld);
    }
}
