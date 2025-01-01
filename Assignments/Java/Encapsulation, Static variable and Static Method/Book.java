public class Book{
    public static int total_books_sold = 0;
    public static double total_revenue = 0.0;
    public String name;
    public int discount;
    public double price;
    public Book(String name, int discount){
        this.name = name;
        this.discount = discount;
        this.price = 150.0;
        Book.total_books_sold++;
    }
    public double price_After_Discount(){
        price = price - ((discount/100.0)*price);
        Book.total_revenue = Book.total_revenue + price;
        return price;
    }
    public void bookDetails(){
        System.out.println("Title: " + name);
        System.out.println("Price after Discount: " + price_After_Discount() + " TK");
    }
}