/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0621990
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of getCustomerId method, of class Order.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Order.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        String customerId = "";
        Order instance = new Order();
        instance.setCustomerId(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerName method, of class Order.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerName method, of class Order.
     */
    @Test
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String customerName = "";
        Order instance = new Order();
        instance.setCustomerName(customerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeRecieved method, of class Order.
     */
    @Test
    public void testGetTimeRecieved() {
        System.out.println("getTimeRecieved");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getTimeRecieved();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeRecieved method, of class Order.
     */
    @Test
    public void testSetTimeRecieved() {
        System.out.println("setTimeRecieved");
        Date timeRecieved = null;
        Order instance = new Order();
        instance.setTimeRecieved(timeRecieved);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeProcessed method, of class Order.
     */
    @Test
    public void testGetTimeProcessed() {
        System.out.println("getTimeProcessed");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getTimeProcessed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeProcessed method, of class Order.
     */
    @Test
    public void testSetTimeProcessed() {
        System.out.println("setTimeProcessed");
        Date timeProcessed = null;
        Order instance = new Order();
        instance.setTimeProcessed(timeProcessed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeFullfilled method, of class Order.
     */
    @Test
    public void testGetTimeFullfilled() {
        System.out.println("getTimeFullfilled");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getTimeFullfilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeFullfilled method, of class Order.
     */
    @Test
    public void testSetTimeFullfilled() {
        System.out.println("setTimeFullfilled");
        Date timeFullfilled = null;
        Order instance = new Order();
        instance.setTimeFullfilled(timeFullfilled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPurchases method, of class Order.
     */
    @Test
    public void testGetPurchases() {
        System.out.println("getPurchases");
        Order instance = new Order();
        List<Purchase> expResult = null;
        List<Purchase> result = instance.getPurchases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPurchases method, of class Order.
     */
    @Test
    public void testSetPurchases() {
        System.out.println("setPurchases");
        List<Purchase> purchases = null;
        Order instance = new Order();
        instance.setPurchases(purchases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Order.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Order.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Order instance = new Order();
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
