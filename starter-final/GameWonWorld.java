// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * plays audio and shows text on screen
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont("Congratulations, You Win!", 2, 200);
        gameMusic =  new  GreenfootSound("win.wav");
    }

    /**
     * describes the text being shown on screen
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }

    /**
     * plays music
     */
    public void started()
    {
        gameMusic.play();
    }

    /**
     * stops music
     */
    public void stopped()
    {
        gameMusic.stop();
    }
}
