/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
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
     * Test that 'Given a new order arrives, when either customer ID or customer name exists,
     * and there is a list of purchases, then time received is set to now.'
     */
    @Test
    public void testWhenCustomerExistsAndPurchaseExistsThenTimeReceivedIsNow() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001", "TEST Inc.");
        order.addPurchase(new Purchase("PLC000001", 100));
        order.addPurchase(new Purchase("PLC000002", 200));
        orderQueue.addOrder(order);
        long expResult = new Date().getTime();
        long result = order.getTimeReceived().getTime();
        
        assertTrue(Math.abs(result - expResult) < 1000);
    }
    
    /**
     * Test that 'Given a request for the next order, when there are no orders in the system,
     * then return null.'
     */
    @Test
    public void testNewOrderArrivesWithNoIdOrNameExists() throws Exception {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order(null,null);
        order.addPurchase(new Purchase("PLC000001",100));
        order.addPurchase(new Purchase("PLC000002",200));
        
        boolean flag = false;
        
        try {
            orderQueue.addOrder(order);
        } catch (Exception ex) {
            flag = true;
        }
        assertTrue(flag);
    }
    
    /**
     * Test that 'Given a new order arrives, when there is no list of purchases,
     * then throw an exception.'
     */
    @Test
    public void testWhenNewOrderArrivesAndListOfPurchasesNotExistThenThrowException() {
        OrderQueue orderQueue = new OrderQueue();
        Order order = new Order("C0000001", "TEST Inc.");
        orderQueue.addOrder(order);
        
    }
    
    
    
    
    
}
