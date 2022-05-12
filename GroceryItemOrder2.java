package grocerylist;

public class GroceryItemOrder2 {
    private String name;
    private int quantity;
    private double pricePerUnit;
    public GroceryItemOrder2(String name, int quantity, double pricePerUnit) 
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    public double getCost() 
    {
        return quantity * pricePerUnit;
    }
    public void setQuanity(int quantity) 
    {
        this.quantity = quantity;
    }
    public String toString() 
    {
        return quantity + " of " + name;
    }
    
    public String getItemName()
    {
       return this.name;
    }
}
