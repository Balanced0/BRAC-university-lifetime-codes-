public class LL{
    public class Node{
        public int val;
        public Node next;
        
        public Node(int val){
            this.val = val;
        }
        
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    
    public Node head;
    public Node tail;
    
    public int size;
    
    public LL(){
        this.size = 0;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}