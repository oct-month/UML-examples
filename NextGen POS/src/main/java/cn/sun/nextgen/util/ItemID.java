package cn.sun.nextgen.util;

public class ItemID
{
    private int id;

    public ItemID(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public int hashCode()
    {
        return this.id;
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.hashCode() == obj.hashCode();
    }
}
