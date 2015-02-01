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
    
    public String getReport() {
        StringBuilder jsonData = new StringBuilder();
        jsonData.append("");
        
        //IF THERE ARE ORDERS IN THE ARRAYDEQUEUE
        if (orderQueue.size()>0) {
            
            //BEGIN BUILDING STRING
            jsonData.append("{ \"orders\" : [\n").toString();
            
                    //ITERATE THROUGH ORDERS FOR ORDERQUEUE
                    for (Order o : orderQueue) {
                        
                        //APPEND THE BASIC ORDER DETAILS
                        jsonData.append("\t{ \"customerId\" : \"").append(o.getCustomerId()).append("\",\n")
                            .append("\t\t\"customerName\" : \"").append(o.getCustomerName()).append("\",\n")
                            .append("\t\t\"timeProcessed\" : \"").append(o.getTimeProcessed()).append("\",\n")
                            .append("\t\t\"timeFulfilled\" : \"").append(o.getTimeFullfilled()).append("\",\n")
                            .append("\t\t\"purchases\" : [\n");
                        
                            //ITERATE THROUGH PURCHASES FOR EACH ORDER
                            for(Purchase a : o.getPurchases())  {
                                //APPEND PURCHASE ID AND QUANTITY
                                jsonData.append("\t\t\t{ \"productId\" : ").append(a.getProductId) 
                                        .append(", \"quantity\" : ").append(a.getQuantity).append(" }");
                                
                                //IF THERE IS ANOTHER PURCHASE, ADD COMMA TO SEPARATE PURCHASES
                                if (orderQueue.getPurchases().hasNext())
                                    jsonData.append(",\n");
                                
                                else
                                //ADD NEWLINE AT END OF PURCHASE
                                jsonData.append("\n");
                            }
                            
                            //CLOSING DELIMITER FOR PURCHASES
                            jsonData.append("\t\t],\n");
                            
                            //APPEND NOTES
                            jsonData.append("\t\t\"notes\" : \"").append(o.getNotes()).append("\"\n");
                        
                        //CLOSING DELIMITER FOR ORDER
                        jsonData.append("\t}");
                            
                        //IF THERE IS ANOTHER ORDER, ADD COMMA TO SEPARATE ORDERS
                        if (orderQueue.hasNext())
                           jsonData.append(",\n");
                        
                        else
                        //ADD NEWLINE AT END OF ORDER    
                        jsonData.append("\n");
                    }
                    
                    //CLOSING DELIMITER FOR JSONDATA
                    jsonData.append("] }\n");

        }
        
        String jsonString = jsonData.toString();
        return jsonString;
    }
}
