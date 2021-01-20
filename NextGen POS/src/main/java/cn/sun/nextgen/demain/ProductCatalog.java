package cn.sun.nextgen.demain;

import java.util.HashMap;
import java.util.Map;

import cn.sun.nextgen.util.ItemID;
import cn.sun.nextgen.util.Money;

public class ProductCatalog
{
    private Map<ItemID, ProductDescription> descriptions;

    public ProductCatalog()
    {
        descriptions = new HashMap<>();
        loadProdSpecs();
    }

    private void loadProdSpecs()
    {
        ItemID id1 = new ItemID(100);
        ItemID id2 = new ItemID(200);
        Money price1 = new Money(3.5);
        Money price2 = new Money(7);

        ProductDescription desc;
        desc = new ProductDescription(id1, price1, "product 1");
        descriptions.put(id1, desc);
        desc = new ProductDescription(id2, price2, "product 2");
        descriptions.put(id2, desc);
    }

    public ProductDescription getProductDesc(ItemID id)
    {
        return descriptions.get(id);
    }
}
