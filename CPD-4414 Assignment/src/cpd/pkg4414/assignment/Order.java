package cpd.pkg4414.assignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeff Codling - c0471944
 * @author Kyle Crossman - c0621990
 */
public class Order {
    
    private String customerId;
    private String customerName;
    private Date timeRecieved;
    private Date timeProcessed;
    private Date timeFullfilled;
    private List<Purchase> purchases = new ArrayList<>();
    private String notes;

    public Order(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTimeReceived() {
        return timeRecieved;
    }

    public void setTimeReceived(Date timeRecieved) {
        this.timeRecieved = timeRecieved;
    }

    public Date getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(Date timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public Date getTimeFullfilled() {
        return timeFullfilled;
    }

    public void setTimeFullfilled(Date timeFullfilled) {
        this.timeFullfilled = timeFullfilled;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public void addPurchase(Purchase p) {
        purchases.add(p);
    }

}
