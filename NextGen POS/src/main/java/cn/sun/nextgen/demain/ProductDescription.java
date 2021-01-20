package cn.sun.nextgen.demain;

import cn.sun.nextgen.util.ItemID;
import cn.sun.nextgen.util.Money;

public class ProductDescription
{
    
    private ItemID id;
    private Money price;
    private String description;
    
    public ProductDescription(ItemID id, Money price, String desc)
    {
        this.id = id;
        this.price = price;
        this.description = desc;
    }

    public ItemID getId()
    {
        return id;
    }

    public Money getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }
}
