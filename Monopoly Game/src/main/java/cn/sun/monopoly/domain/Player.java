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
        int fv = this.rollDice();
        Square oldLoc = this.piece.getLocation();
        Square newLoc = this.board.getSquare(oldLoc, fv);
        this.piece.setLocation(newLoc);
        // System.out.println("玩家" + this + "从" + oldLoc + "移动到" + newLoc);
    }

    // Extract Method 重构（本方法违反了CQS原则，但是对于私有方法不严格）
    private int rollDice()
    {
        int rollTotal = 0;
        for (Die die : this.dices)
        {
            die.roll();
            rollTotal += die.getFaceValue();
        }
        return rollTotal;
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
