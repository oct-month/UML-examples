package cn.sun.nextgen.demain;

import cn.sun.nextgen.util.ItemID;
import cn.sun.nextgen.util.Money;

public class Register
{
    private ProductCatalog catalog;
    private Sale currentSale;
    private Store store;

    public Register(Store store, ProductCatalog catalog)
    {
        this.catalog = catalog;
        this.store = store;
    }

    public void makeNewSale()
    {
        this.currentSale = new Sale();
    }

    public void enterItem(ItemID id, int qty)
    {
        ProductDescription desc = catalog.getProductDesc(id);
        this.currentSale.makeLineItem(desc, qty);
    }

    public void endSale()
    {
        this.currentSale.becomeComplete();
    }

    public void makePayment(Money cashTendered)
    {
        this.currentSale.makePayment(cashTendered);
        this.store.addCompleteSale(this.currentSale);
    }

    public Sale getCurrentSale()
    {
        return currentSale;
    }
}
