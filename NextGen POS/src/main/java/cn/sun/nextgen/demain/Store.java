package cn.sun.nextgen.demain;

import java.util.ArrayList;
import java.util.List;

public class Store
{
    private String address;
    private String name;
    private List<Sale> completedSales;
    private Register register;
    private ProductCatalog catalog;

    public Store()
    {
        this.catalog = new ProductCatalog();
        this.register = new Register(this, catalog);
        this.completedSales = new ArrayList<>();
    }

    public void addCompleteSale(Sale s)
    {
        completedSales.add(s);
    }

    public Register getRegister()
    {
        return register;
    }
}
