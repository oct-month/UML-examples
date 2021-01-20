package cn.sun.nextgen.demain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.sun.nextgen.util.Money;

public class Sale
{
    private boolean isComplete;
    private Date time;
    private List<SalesLineItem> lineItems;
    private Payment payment;

    public Sale()
    {
        this.isComplete = false;
        this.time = new Date();
        this.lineItems = new ArrayList<>();
    }

    public Money getBalance()
    {
        Money bal = this.payment.getAmount();
        bal.minus(this.getTotal());
        return bal;
    }

    public void makeLineItem(ProductDescription desc, int qty)
    {
        SalesLineItem sl = new SalesLineItem(desc, qty);
        this.lineItems.add(sl);
    }

    public Money getTotal()
    {
        Money tot = new Money();
        Money subtotal = null;
        for (SalesLineItem sli : lineItems)
        {
            subtotal = sli.getSubtotal();
            tot.add(subtotal);
        }
        return tot;
    }

    public void makePayment(Money cashTendered)
    {
        this.payment = new Payment(cashTendered);
    }

    public void becomeComplete()
    {
        this.isComplete = true;
    }

    public boolean isComplete()
    {
        return this.isComplete();
    }
}
