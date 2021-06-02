package DataTypeAssignments.SuperMarket;
class Item {
    private String productName;
    private int quantity = 1;
    private double unitPrice;
    Item(String productName, int quantity, double unitPrice){
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    Item(String productName, double unitPrice){
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    double getPrice(){
        return unitPrice;
    }

    String getName(){
        return productName;
    }

    void updateQuantity(int n){
        this.quantity += n;
    }

    int getQuantity(){
        return quantity;
    }
}
