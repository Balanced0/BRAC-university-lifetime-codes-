public class Product{
    private String name;
    private double price;
    private int quantity;
    private boolean open;
    public Product(){
        this.name = "Unknown";
        this.price = 0.0;
        this.open = false;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.open = false;
    }
    public void displayInfo(){
        System.out.println("Product Name: " + name);
        System.out.print("Price: $" + price);
    }
    public void displayInfo(boolean open){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        this.open = open;
        if(this.open == true){
            System.out.println("Quantity: " + getQuantity());
        }
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    } 
}