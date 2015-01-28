/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment;

import java.util.ArrayDeque;
import java.util.Date;

/**
 * @author Jeff Codling - c0471944
 * @author Kyle Crossman - c0621990
 */
public class OrderQueue {
    ArrayDeque<Order> orderQueue = new ArrayDeque<>();
    
    public void addOrder(Order orderToAdd) throws Exception {
        if(orderToAdd.getCustomerId().isEmpty() || orderToAdd.getCustomerName().isEmpty()) {
            throw new Exception("Customer Name or Customer ID not defined");
        } else {
            orderQueue.addLast(orderToAdd);
            orderToAdd.setTimeReceived(new Date());
        }
        
    }
    
    public Order getNextOrder() {
        return orderQueue.getFirst();
    }
}
