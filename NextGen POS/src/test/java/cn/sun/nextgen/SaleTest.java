package cn.sun.nextgen;

import cn.sun.nextgen.demain.ProductDescription;
import cn.sun.nextgen.demain.Sale;
import cn.sun.nextgen.util.ItemID;
import cn.sun.nextgen.util.Money;

import junit.framework.TestCase;

public class SaleTest extends TestCase
{
    // 测试 Sale.makeLineItem 方法
    public void testMakeLineItem()
    {
        // 步骤1：创建测试固件 fixture
        Sale fixture = new Sale();
        // 设置辅助测试的对象
        Money total = new Money(7.5);
        Money price = new Money(2.5);
        ItemID id = new ItemID(1);
        ProductDescription desc = new ProductDescription(id, price, "product 1");

        // 步骤2：执行测试方法
        fixture.makeLineItem(desc, 1);
        fixture.makeLineItem(desc, 2);

        // 步骤3：评估结果
        assertEquals(fixture.getTotal(), total);
    }
}
