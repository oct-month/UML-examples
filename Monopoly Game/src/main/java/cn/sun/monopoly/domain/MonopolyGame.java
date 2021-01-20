package cn.sun.monopoly.domain;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame
{
    public static final int ROUNDS_TOTAL = 20;
    public static final int PLAYERS_TOTAL = 2;

    private Die[] dices;
    private Board board;
    private List<Player> players;

    public MonopolyGame(String[] players)
    {
        this.dices = new Die[] {new Die(), new Die()};
        this.board = new Board();
        this.players = new ArrayList<>();
        for (String playerName : players)
        {
            this.players.add(new Player(playerName, dices, board));
        }
    }

    public void playGame()
    {
        for (int i = 0; i < ROUNDS_TOTAL; i++)
        {
            this.playRound();
        }
    }

    private void playRound()
    {
        for (Player player : this.players)
        {
            player.takeTurn();
        }
    }

    public List<Player> getPlayers()
    {
        return players;
    }
}
