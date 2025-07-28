// LabTask2: Word Decoder
public class LabTask2 {

    // Must Submit this method
    // After you're done coding submit only this method
    public static Node wordDecoder(Node head) {

        // You're suppose to create a new Dummy headed Singly Linked List in this method
        // Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        Node dhead = new Node(null, null);
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        current = head;
        int n = 13 % size;
        int count = 0;
        Node temp = dhead;
        while (current != null) {
            if (count % n == 0 && count >= n) {
                temp.next = current;
                temp = temp.next;
            }
            count++;
            current = current.next;
        }
        temp.next = null;
        current = dhead.next;
        Node prev = null;
        while (current != null) {
            Node after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }
        dhead.next = prev;

        return dhead;
    }

    // NOTE: if you find any issue with the driver code please inform AIB
    // DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[] { 'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C' });
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println("Your output: ");
        LinkedList.printLL(result); // This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[] { 'Z', 'O', 'T', 'N', 'X' });
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println("Your output: ");
        LinkedList.printLL(result); // This should print null -> N
        System.out.println();
    }
}
