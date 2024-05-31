package Assignment2;
public class SingleLinkedList {
    private Node head;

    // Method to insert a node at a given position
    public void insertAtPos(int position, int data) {
        Node newNode = new Node(data);

        // If inserting at the head (position 0)
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
    for (int i = 0; i < position - 1; i++) {
        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode; }

    // Method to delete a node at a given position
    public void deleteAtPos(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        // If deleting the head node (position 0)
        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            current = current.next;
        }
        current.next = current.next.next;
    }
    // Method to delete a node after a given node
    public void deleteAfterNode(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            throw new IllegalArgumentException("Given node not found or there is no node after the given node");
        }
        current.next = current.next.next;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertAtPos(0, 1);  // Insert 1 at position 0
        sll.insertAtPos(1, 2);  // Insert 2 at position 1
        sll.insertAtPos(2, 3);  // Insert 3 at position 2
        sll.insertAtPos(1,4);   // Insert 4 at position 1
        sll.display();  // Output: 1 -> 4 -> 2 -> 3 -> null

        sll.deleteAtPos(2);  // Delete node at position 2
        sll.display();  // Output: 1 -> 4 -> 3 -> null

        sll.insertAtPos(1, 4);  // Insert 4 at position 1
        sll.insertAtPos(2, 5);  // Insert 5 at position 2
        sll.display();  // Output: 1 -> 4 -> 5 -> 4 -> 3 -> null

        sll.deleteAfterNode(4);  // Delete node after the node with data 4
        sll.display();  // Output: 1 -> 4 -> 4 -> 3 -> null
    }
}
