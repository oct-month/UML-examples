package cn.sun.monopoly.domain;

public class Board
{
    public static final int SIZE = 40;

    private Square[] squares;

    public Board()
    {
        this.buildSquares();
        this.linkSquares();
    }

    private void buildSquares()
    {
        this.squares = new Square[SIZE];
        for (int i = 0; i < squares.length; i++)
        {
            this.squares[i] = new Square("Square" + (i + 1), i);
        }
    }

    private void linkSquares()
    {
        for (int i = 0; i < this.squares.length; i++)
        {
            this.squares[i].setNextSquare(this.squares[(i + 1) % SIZE]);
        }
    }

    public Square getSquare(Square oldLoc, int fv)
    {
        int num = (oldLoc.getIndex() + fv) % 40;
        return this.squares[num];
    }

    public Square getStartSquare()
    {
        return this.squares[0];
    }
}
