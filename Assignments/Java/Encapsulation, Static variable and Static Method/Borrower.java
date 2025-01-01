public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  public String name;
  public String borrowedBooks[] = new String[3];
  public int index;
  public Borrower(String name){
      this.name = name;
  }
  public void borrowBook(String bookName){
      for(int i = 0; i < 3; i++){
          if(bookName.equals(Borrower.book_name[i])){
              if(book_count[i] == 0){
                  System.out.println("This book is not available.");
                  break;
              }
              book_count[i]--;
              borrowedBooks[index++] = bookName;
          }
      }
  }
  public void borrowerDetails(){
      System.out.println("Name: " + name);
      System.out.println("Books Borrowed:");
      for(int i = 0; i < index; i++){
          System.out.println(borrowedBooks[i]);
      }
  }
  public static int remainingBooks(String bookName){
      int count = 0;
      for(int i = 0; i < 3; i++){
          if(bookName.equals(Borrower.book_name[i])){
              count = book_count[i];
          }
      }
      return count;
  }
  public static void bookStatus(){
      System.out.println("Available Books:");
      for(int i = 0; i < 3; i++){
          System.out.println(Borrower.book_name[i] + ": " + Borrower.book_count[i]);
      }
  }
  
}
