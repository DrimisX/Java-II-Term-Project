/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment;

import java.util.ArrayDeque;

/**
 *
 * @author Kyle Crossman - c0621990
 */
public class OrderQueue {
    ArrayDeque<Order> orderQueue = new ArrayDeque<>();
    
    public void addOrder(Order orderToAdd) {
        orderQueue.addLast(orderToAdd);
    }
    
    public Order getNextOrder() {
        return orderQueue.getFirst();
    }
}
