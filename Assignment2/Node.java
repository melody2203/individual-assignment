package Assignment2;
/**
 * Represents a node in a linked list with an integer data value and a reference to the next node.
 */
public class Node {
    int data;
    Node next;
     /**
     * Constructor to create a new node with the given data value.
     * parameter "data" is the integer data value to be stored in the node.
     */
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
