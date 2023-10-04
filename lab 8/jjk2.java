// Program to demonstrate the usage of the LinkedList class
public class jjk2 {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Insert elements into the linked list
        myList.insert(5);
        myList.insert(10);
        myList.insert(15);
        myList.insert(20);

        // Print the initial list
        System.out.println("Initial List:");
        myList.print();

        // Perform various operations
        System.out.println("Count: " + myList.count());
        System.out.println("Search 10: " + myList.search(10));
        System.out.println("Search 25: " + myList.search(25));

        // Delete a node from the linked list
        myList.delete(15);

        // Print the final list
        System.out.println("Final List:");
        myList.print();
    }
}

// Node class represents a single node in the linked list
class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    // Constructor to create a new node with the given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents a linked list
class LinkedList {
    Node head; // Reference to the head (first node) of the linked list

    // Method to insert a new node at the beginning of the linked list
    void insert(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = head; // Set the next pointer of the new node to the current head
        head = newNode; // Set the head to the new node
    }

    // Method to delete a node from the linked list by its value
    void delete(int data) {
        Node current = head;
        Node prev = null;

        // Iterate through the linked list to find the node to delete
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the node is found, remove it from the linked list
        if (current != null) {
            if (prev != null) {
                prev.next = current.next; // Update the next pointer of the previous node
            } else {
                head = current.next; // If the node to delete is the head, update the head
            }
        }
    }

    // Method to search for a given value in the linked list
    boolean search(int data) {
        Node current = head;

        // Iterate through the linked list to search for the value
        while (current != null) {
            if (current.data == data) {
                return true; // Value found
            }
            current = current.next;
        }

        return false; // Value not found
    }

    // Method to count the number of nodes in the linked list
    int count() {
        int count = 0;
        Node current = head;

        // Iterate through the linked list and increment the count for each node
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Method to print all the elements in the linked list
    void print() {
        Node current = head;

        // Iterate through the linked list and print the data of each node
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
