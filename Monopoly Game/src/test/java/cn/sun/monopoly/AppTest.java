package cn.sun.monopoly;

import cn.sun.monopoly.domain.MonopolyGame;
import cn.sun.monopoly.domain.Player;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        MonopolyGame mGame = new MonopolyGame(new String[]{"狂含香", "力琬琰", "烟迈", "仉琪睿", "习翱"});
        assertEquals(mGame.getPlayers().size(), 5);
        for(Player player : mGame.getPlayers())
        {
            assertEquals(player.getLocation().getIndex(), 0);
        }
    }
}
