public class Main{
    public static void main(String[] args){
        LL list = new LL();
        
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(50);
        list.insertFirst(100);
        list.insertLast(101);
        list.insert(45, 2);
        list.display();
    }
}