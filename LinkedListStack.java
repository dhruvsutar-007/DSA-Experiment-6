```java
import java.util.Scanner;

class Stack {
    class Node {
        int patientID;
        Node next;

        Node(int id) {
            patientID = id;
            next = null;
        }
    }

    Node top = null;

    // Add a patient record
    void push(int id) {
        Node newNode = new Node(id);
        newNode.next = top;
        top = newNode;
        System.out.println("Patient added: " + id);
    }

    // Remove the latest patient record
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Patient removed: " + top.patientID);
            top = top.next;
        }
    }

    // Display patient records
    void display() {
        if (top == null) {
            System.out.println("No patient records");
            return;
        }

        Node temp = top;

        System.out.println("Patient records:");

        while (temp != null) {
            System.out.println(temp.patientID);
            temp = temp.next;
        }
    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        int choice;

        do {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Display Patients");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    s.push(id);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
```