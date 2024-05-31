package DSA_Individual_project;

import java.util.Scanner;

public class ToDoListApp {
    private static Node head;
    private Scanner scanner;

    public ToDoListApp() {
        this.head = null;
        this.scanner = new Scanner(System.in);
    }

    public void addTask() {
        System.out.print("Enter the task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();
        Task newTask = new Task(title, description);
        Node newNode = new Node(newTask);
        if (head == null) {
            head = newNode;
        } else {
            Node tempo = head;
            while (tempo.next != null) {
                tempo = tempo.next;
            }
            tempo.next = newNode;
        }
        System.out.println("Task added successfully");
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("The task list is empty.");
            return;
        }
        Node tempo = head;
        while (tempo != null) {
            System.out.println("Title: " + tempo.task.getTitle());
            System.out.println("Description: " + tempo.task.getDescription());
            System.out.println("Completed: " + (tempo.task.isCompleted() ? "Yes" : "No"));
            System.out.println();
            tempo = tempo.next;
        }
    }

    public void markToDoAsCompleted() {
        System.out.print("Enter the task title: ");
        String title = scanner.nextLine();
        Node tempo = head;
        while (tempo != null) {
            if (tempo.task.getTitle().equalsIgnoreCase(title)) {
                tempo.task.markCompleted();
                System.out.println("Task " + "'" + title + "'" + " has been marked as completed.");
                return;
            }
            tempo = tempo.next;
        }
        System.out.println("Task " + title + "' not found in the to-do list.");
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. Display all Tasks");
            System.out.println("3. Mark Task as completed");
            System.out.println("4. Exit");
            System.out.print("Choose an alternative: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    markToDoAsCompleted();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choice out of range. Please try again.");
            }
            System.out.println();
        } while (choice != 4);
    }

    public static void main(String[] args) {
        ToDoListApp todoList = new ToDoListApp();
        todoList.displayMenu();
    }
}
