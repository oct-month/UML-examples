package cn.sun.monopoly.domain;

public class Player
{
    private String name;
    private Die[] dices;
    private Board board;
    private Piece piece;

    public Player(String name, Die[] dices, Board board)
    {
        this.name = name;
        this.dices = dices;
        this.board = board;
        this.piece = new Piece(board.getStartSquare());
    }

    public void takeTurn()
    {
        int fv = 0;
        for (Die die : this.dices)
        {
            die.roll();
            fv += die.getFaceValue();
        }
        Square oldLoc = this.piece.getLocation();
        Square newLoc = this.board.getSquare(oldLoc, fv);
        this.piece.setLocation(newLoc);
        // System.out.println("玩家" + this + "从" + oldLoc + "移动到" + newLoc);
    }

    public String getName()
    {
        return this.name;
    }

    public Square getLocation()
    {
        return this.piece.getLocation();
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
