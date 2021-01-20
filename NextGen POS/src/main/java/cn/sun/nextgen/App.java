package cn.sun.nextgen;

import cn.sun.nextgen.demain.Register;
import cn.sun.nextgen.demain.Store;
import cn.sun.nextgen.util.ItemID;
import cn.sun.nextgen.util.Money;

public class App 
{
    public static void main(String[] args)
    {
        Store store = new Store("阳光超市", "某师大");
        Register register = store.getRegister();

        register.makeNewSale();
        register.enterItem(new ItemID(100), 3);
        register.enterItem(new ItemID(200), 2);
        register.makePayment(new Money(20 + 10));
        register.endSale();

        System.out.println("找零：" + register.getCurrentSale().getBalance());
    }
}
