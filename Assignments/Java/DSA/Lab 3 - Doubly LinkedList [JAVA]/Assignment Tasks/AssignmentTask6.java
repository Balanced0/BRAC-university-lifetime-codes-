public class AssignmentTask6 {

    // SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        // TO DO
        DNode current1 = dh1.next;
        DNode current2 = dh2.next;
        DNode temp1 = current1.next;
        DNode temp2 = current2.next;
        while (current1.next != null) {
            current1.next = current2;
            current2.prev = current1;
            current2.next = temp1;
            temp1.prev = current2;
            current1 = temp1;
            current2 = temp2;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        current1.next = current2;
        current2.prev = current1;
        current2.next = dh1;
        dh1.prev = current2;
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = { "A", "B", "C", "D" };
        Object[] list2 = { "E", "F", "G", "H" };

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = { "A", "E", "B", "F", "C", "G", "D", "H" };
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        // Running the Pair Join
        pairJoin(dh1, dh2);
        // Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
