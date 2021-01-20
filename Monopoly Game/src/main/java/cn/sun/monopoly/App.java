package cn.sun.monopoly;

import cn.sun.monopoly.domain.MonopolyGame;

public class App
{
    public static void main(String[] args)
    {
        MonopolyGame mGame = new MonopolyGame(new String[]{"狂含香", "力琬琰", "烟迈", "仉琪睿", "习翱"});
        mGame.playGame();
    }
}
