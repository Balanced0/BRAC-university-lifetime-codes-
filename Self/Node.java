public class Node{
    public int val;
    public Node next;
    
    public Node(int val){
        this.val = val;
    }
    
    public Node(int val, Node address){
        this.val = val;
        this.next = address;
    }
}