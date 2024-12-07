public class Shelf{
    public int capacity;
    public int num_of_books;
    public void addBooks(int i){
        if(this.capacity == 0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if(i + this.num_of_books > this.capacity){
            System.out.println("Exceeds capacity");
        }
        else if(i + this.num_of_books < this.capacity){
            this.num_of_books = i + this.num_of_books;
            System.out.println(i + " books added to shelf");
        }
    }
    public void showDetails(){
        System.out.println("Shelf capacity: " + this.capacity);
        System.out.println("Number of books: " + this.num_of_books);
    }
}