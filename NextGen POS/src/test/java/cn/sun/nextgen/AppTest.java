package cn.sun.nextgen;

import cn.sun.nextgen.demain.Register;
import cn.sun.nextgen.demain.Store;
import cn.sun.nextgen.util.ItemID;
import cn.sun.nextgen.util.Money;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Store store = new Store();
        Register register = store.getRegister();

        register.makeNewSale();
        register.enterItem(new ItemID(100), 3);
        register.enterItem(new ItemID(200), 2);
        register.makePayment(new Money(20 + 10));
        register.endSale();

        Money balance = register.getCurrentSale().getBalance();
        assertEquals(balance.getAmount(), 5.5);
    }
}
