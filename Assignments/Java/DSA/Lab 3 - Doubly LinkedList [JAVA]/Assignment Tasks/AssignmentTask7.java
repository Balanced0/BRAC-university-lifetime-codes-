public class AssignmentTask7 {

    // SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        // TO DO
        int range = 0;
        DNode temp = dh.next;
        while (temp != dh) {
            if ((int) temp.elem >= start && (int) temp.elem <= end) {
                range++;
            }
            temp = temp.next;
        }
        int count = 0;
        DNode current = dh.next;
        while (current != dh && count < range) {
            DNode after = current.next;
            if ((int) current.elem >= start && (int) current.elem <= end) {
                current.prev.next = current.next;
                current.next.prev = current.prev;

                current.next = dh;
                current.prev = dh.prev;
                dh.prev.next = current;
                dh.prev = current;
                count++;
            }
            current = after;
        }
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = { 5, 3, 7, 1, 9, 6, 2, 4 };
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = { 3, 1, 9, 2, 4, 5, 7, 6 };
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        // Running the Range Move with [5,7] range
        rangeMove(dh, 5, 7);
        // Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
