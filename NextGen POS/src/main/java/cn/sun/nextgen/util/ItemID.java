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
        if (obj instanceof ItemID)
            return this.id == ((ItemID) obj).getId();
        else
            return false;
    }
}
