package Assignment2;

public class LinkedListStack {
    Node head;
    Node top;

    LinkedListStack() {
        this.head = null;
        this.top = null;
    }

    // Single Linked List Methods
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public boolean searchNode(int key) {
        Node temp = head;
        while (temp!= null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Stack Methods
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void displayStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListStack lls = new LinkedListStack();

        // Singly Linked List demonstration
        System.out.println("Single Linked List:");
        lls.append(8);
        lls.append(2);
        lls.append(4);
        lls.append(5);
        System.out.print("Linked List Elements: ");
        lls.displayList();

        int toBeSearched = 2;
        System.out.println(toBeSearched + " is in the linked list " + ": " + lls.searchNode(toBeSearched));
        toBeSearched = 9;
        System.out.println(toBeSearched + " is in the linked list " + ": " + lls.searchNode(toBeSearched));

        // Stack demonstration
        System.out.println("\nStack:");
        lls.push(12);
        lls.push(1);
        lls.push(4);
        lls.push(11);
        System.out.print("Stack Elements: ");
        lls.displayStack();

        System.out.println("Top Element: " + lls.peek());
        System.out.println("Popped Element: " + lls.pop());
        System.out.print("Stack Elements after Pop: ");
        lls.displayStack();
    }
}
