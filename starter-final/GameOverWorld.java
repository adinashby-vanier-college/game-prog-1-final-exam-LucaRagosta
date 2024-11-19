// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * shows text on screen and plays audio
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont("Game Over!", 200, 200);
        gameMusic =  new  GreenfootSound("lose.wav");
    }

    /**
     * details of text on screen 
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
     * plays music, 
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
