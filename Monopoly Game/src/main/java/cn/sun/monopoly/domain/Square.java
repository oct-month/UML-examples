package cn.sun.monopoly.domain;

public class Square
{
    private int index;
    private String name;
    private Square nextSquare;

    public Square(String name, int index)
    {
        this.name = name;
        this.index = index;
    }

    public void setNextSquare(Square nextSquare)
    {
        this.nextSquare = nextSquare;
    }

    public Square getNextSquare()
    {
        return nextSquare;
    }

    public String getName()
    {
        return name;
    }

    public int getIndex()
    {
        return index;
    }

    @Override
    public String toString()
    {
        return "[index=" + index + ", name=" + name + "]";
    }
}
