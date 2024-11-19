// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    private int shotsFired;
    private int gunReloadTime;
    private int reloadDelayCount;
    private Vector acceleration;

    /**
     * Initialise tha Canon (I tried to make it work but it didnt)
     */
    public Canon()
    {
        gunReloadTime = 20;
        reloadDelayCount = 0;
        shotsFired = 0;
    }

    /**
     * 
     */
    public void act()
    {
        reloadDelayCount = reloadDelayCount + 1;
    }

    /**
     * 
     */
    public int getShotsFired()
    {
        return shotsFired;
    }

    /**
     * 
     */
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }

    /**
     * 
     */
    private void fire()
    {
        if (reloadDelayCount >= gunReloadTime) {
            CannonBall b =  new  CannonBall();
            getWorld().addObject(b, getX(), getY());
            shotsFired = shotsFired + 1;
            reloadDelayCount = 0;
        }
    }
}
