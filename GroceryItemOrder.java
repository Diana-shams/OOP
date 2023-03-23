public class GroceryItemOrder extends GroceryList {
    String Item_name;
    int quantity;
    double PricePerUnit;
    public GroceryItemOrder(String Item_name,double PricePerUnit)
    {
        this.Item_name=Item_name;
        this.PricePerUnit=PricePerUnit;
    }
    public double getCost()
    {
        return quantity*PricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
