package cpd.pkg4414.assignment;

/**
 *
 * @author Jeff Codling - c0471944
 * @author Kyle Crossman - c0621990
 */
class Purchase {
    private int productId;
    private int quantity;

    public Purchase(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
