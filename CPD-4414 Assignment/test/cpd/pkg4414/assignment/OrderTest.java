/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd.pkg4414.assignment;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeff
 */
public class OrderTest {
    
    public OrderTest() {
    }

    @Test
    public void testOrderNoTimeProcessedOnFullfill() {
        System.out.println("testOrderNoTimeProcessedOnFullfill");
        Purchase purchase = new Purchase("Product132",500);
        ArrayList<Purchase> purchases = new ArrayList<>();
        purchases.add(purchase);
        Order order = new Order("ABC123","Sample name");
        
        // not done yet
    }
    
}
