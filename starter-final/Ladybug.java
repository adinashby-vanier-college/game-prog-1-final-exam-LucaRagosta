// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        win();
    }

    /**
     * Initializes the movement in all 4 directions (up and down are for turning
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(-5);
        }
    }

    /**
     * if they  are intersecting ti ends
     */
    public void win()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
    }

    /**
     * transitions to game won world for win
     */
    public void transitionToGameWorld()
    {
        World crabWorld = getWorld();
        crabWorld.stopped();
        World gameWonWorld =  new  GameWonWorld();
        gameWonWorld.started();
        Greenfoot.setWorld(gameWonWorld);
    }
}
