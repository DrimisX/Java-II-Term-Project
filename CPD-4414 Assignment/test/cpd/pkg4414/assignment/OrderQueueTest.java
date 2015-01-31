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
 * @author Jeff Codling - c0471944
 * @author Kyle Crossman - c0621990
 * @author Dylan Huculak - c0630163
 */
public class OrderQueueTest {
    
    public OrderQueueTest() {
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
     * BEHAVIOUR 1 - Len's Example (Modified by Dylan to adhere to 'Either' clause)
     * Test that 'Given a new order arrives, when either customer ID or customer name exists,
     * and there is a list of purchases, then time received is set to now.'
     * 
     * @throws Exception - addOrder with Purchase List if Time Received is not now
     */
    @Test
    public void testWhenCustomerExistsAndPurchaseExistsThenTimeReceivedIsNow() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001");
        order.addPurchase(new Purchase( 1, 100));
        order.addPurchase(new Purchase( 2, 200));
        orderQueue.addOrder(order);
        long expResult = new Date().getTime();
        long result = order.getTimeReceived().getTime();
        
        assertTrue(Math.abs(result - expResult) < 1000);
    }

    /**
     * BEHAVIOUR 2 - Jeff
     * Given a new order arrives, when neither customer ID nor customer name exists,
     * then throw an exception
     * 
     * @throws Exception 
     */
    @Test
    public void testNewOrderArrivesWithNoIdOrNameExists() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order(null,null);
        order.addPurchase(new Purchase( 1,100));
        order.addPurchase(new Purchase( 2,200));
        
        boolean flag = false;
        
        try {
            orderQueue.addOrder(order);
        } catch (Exception ex) {
            flag = true;
        }
        assertTrue(flag);
    }
    
    /**
     * BEAVIOUR 3 - Dylan
     * Test that 'Given a new order arrives, when there is no list of purchases,
     * then throw an exception.'
     * 
     * @throws Exception - addOrder if Purchase List does not exist
     */
    @Test
    public void testWhenNewOrderArrivesAndListOfPurchasesNotExistThenThrowException() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001");
        orderQueue.addOrder(order);
        
        List<Purchase> purchases = order.getPurchases();
        
        assertTrue(purchases != null);
    }
    
    /**
     * BEHAVIOUR 4 - Jeff
     * Test that 'Given a request for the next order, when there are orders in the system,
     * then return the order with the earliest time received that does not have a time processed.'
     * 
     * @throws Exception - getNextOrder has no orders
     */
    @Test
    public void testNextOrderExistsReturnEarliestOrderNotProcessed() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001", "TEST Inc.");
        order.addPurchase(new Purchase( 1, 100));
        order.addPurchase(new Purchase( 2, 200));
        orderQueue.addOrder(order);
        
        try {
            Order nextOrder = orderQueue.getNextOrder();
        } catch (Exception ex) {
            assertTrue(false);
        }
        assertTrue(true);
    }
    
    /**
     * BEHAVIOUR 5 - Dylan
     * Test that 'Given a request for the next order, when there are no orders in the system, 
     * then return null.'
     * @throws java.lang.Exception
     */
    @Test
    public void testNextOrderRequestedAndNoOrdersExistThenReturnNull() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = orderQueue.getNextOrder();
        
        Order expResult = null;
        Order result = orderQueue.getNextOrder();
        
        assertTrue (expResult == result);

    }
    
    /**
     * BEHAVIOUR 6 - Jeff
     * Given a request to process an order, when the order has a time received
     * and all the purchases are in-stock in the inventory table, then set the
     * time processed to now.
     * 
     * @throws Exception - addOrder if customer ID or name is not set
     */
    @Test
    public void testProcessOrderHasTimeRecievedInStockSetTimeProcessedToNow() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001", "TEST Inc.");
        order.addPurchase(new Purchase( 1, 10));
        order.addPurchase(new Purchase( 2, 20));
        orderQueue.addOrder(order);
        
        boolean flag = order.processPurchases();
        
        assertTrue(flag);
    }
    
    /**
     * BEHAVIOUR 7 - Dylan
     * 
     */
    
    /**
     * BEHAVIOUR 8 - Jeff
     * Given a request to fulfill an order, when the order has a time processed
     * and a time received and all of the purchases are in-stock in the inventory
     * table, then set the time fulfilled to now.
     * 
     * @throws Exception - addOrder if customer ID or name is not set
     */
    @Test
    public void testFulfillOrderWhenProcessedAndReceivedAndInStockSetTimeFulfilledToNow() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001", "TEST Inc.");
        order.addPurchase(new Purchase( 1, 10));
        order.addPurchase(new Purchase( 2, 20));
        orderQueue.addOrder(order);
        order.setTimeProcessed(new Date());
        
        boolean flag = order.fulfillOrder();
        
        assertTrue(flag);
    }
    
}
