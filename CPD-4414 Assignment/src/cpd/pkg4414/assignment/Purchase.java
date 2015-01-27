package cpd.pkg4414.assignment;

/**
 *
 * @author Jeff Codling - c0471944
 * @author Kyle Crossman - c0621990
 */
class Purchase {
    private String productId;
    private int quantity;

    public Purchase() {
        this.productId = "";
        this.quantity = 0;
    }
    
    public Purchase(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
