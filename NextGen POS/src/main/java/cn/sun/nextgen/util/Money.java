package cn.sun.nextgen.util;

public class Money
{
    private double amount;

    public Money()
    {
        this.amount = 0;
    }
    
    public Money(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return amount;
    }
    
    public Money times(double times)
    {
        return new Money(amount * times);
    }

    public void add(Money money)
    {
        this.amount += money.getAmount();
    }

    public void minus(Money money)
    {
        this.amount -= money.getAmount();
    }

    @Override
    public String toString()
    {
        return String.format("%.2f", this.amount) + "$";
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (obj instanceof Money)
            return this.amount == ((Money) obj).getAmount();
        else
            return false;
    }
}
