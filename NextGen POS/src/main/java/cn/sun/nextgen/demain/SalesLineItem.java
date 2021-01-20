package cn.sun.nextgen.demain;

import cn.sun.nextgen.util.Money;

public class SalesLineItem
{
    private int quantity;
    private ProductDescription description;

    public SalesLineItem(ProductDescription desc, int qty)
    {
        this.description = desc;
        this.quantity = qty;
    }

    public Money getSubtotal()
    {
        return description.getPrice().times(quantity);
    }
}
