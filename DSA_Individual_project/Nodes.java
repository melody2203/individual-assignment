package DSA_Individual_project;

public class Nodes {
    private Task task;
    private Node next;

    public void Node(Task task) {
        this.task = task;
        this.next = null;
    }
    public void setTask(Task task) {
        this.task = task;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void displayTask() {
        System.out.println(task.toString());
    }
}
