package cn.sun.monopoly.domain;

public class Piece
{
    private Square location;

    public Piece(Square location)
    {
        this.location = location;
    }

    public Square getLocation()
    {
        return this.location;
    }

    public void setLocation(Square location)
    {
        this.location = location;
    }
}
