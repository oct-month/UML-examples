package cn.sun.nextgen.demain;

import cn.sun.nextgen.util.Money;

public class Payment
{
    private Money amount;

    public Payment(Money cashTendered)
    {
        this.amount = cashTendered;
    }

    public Money getAmount()
    {
        return amount;
    }
}
