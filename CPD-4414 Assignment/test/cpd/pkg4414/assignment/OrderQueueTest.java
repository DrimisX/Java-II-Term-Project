/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment;

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
     * Test of addOrder method, of class OrderQueue.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Order orderToAdd = null;
        OrderQueue instance = new OrderQueue();
        instance.addOrder(orderToAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void requestNextOrderNoNextOrderReturnNull() {
        System.out.println("getNextOrder");
        OrderQueue instance = new OrderQueue();
        Order expResult = null;
        Order returnedOrder = instance.getNextOrder();
        
        assertEquals(expResult, returnedOrder);
    }
    
    @Test
    public void processOrderHasTimeRecievedThenSetTimeProccessedToNow() {
        
    }
    
    @Test
    public void processOrderNotHaveTimeRecievedThenThrowException() {
        
    }
    
    @Test
    public void fuffillOrderHasTimeRecievedAndTimeProcessedThenSetTimeFulfilledToNow() {
        
    }
}
