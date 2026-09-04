
/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * 
 * 
 * Student Name: FN_Mohammed Tahar _____LN_Souida
 * Student ID:  041200233
 * Program: CET-CS
 * Course: data structures
 * Lab Section:  302
 * Professor: James Mwangi PhD.
 */



// ===================== Node class ======================
/**
 * Represents a single node in a doubly linked list.
 * Stores an integer value and references to the next and previous nodes.
 */
class Node {

    /** The integer value stored in this node. */
    public int mData;

    /** Reference to the next node in the list. */
    public Node next;

    /** Reference to the previous node in the list. */
    public Node previous;

    /**
     * Constructs a new node with the given integer value.
     *
     * @param d the integer value to store in this node
     */
    public Node(int d) {
        mData = d;
    }

    /**
     * Prints the value stored in this node.
     */
    public void displayNode() {
        System.out.print(mData + " ");
    }
}

// ===================== DoublyLinkedList class ======================
/**
 * A doubly linked list implementation supporting insertion at both ends,
 * deletion of specific nodes, and forward/backward traversal with indices.
 */
public class DoublyLinkedList {

    /** Reference to the first node (head) of the list. */
    private Node first;

    /** Reference to the last node (tail) of the list. */
    private Node last;

    /**
     * Constructs an empty doubly linked list.
     */
    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    /**
     * Checks whether the list is empty.
     *
     * @return true if the list contains no nodes, false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Inserts a new node at the beginning of the list.
     *
     * @param num the integer value to insert
     */
    public void insertFirst(int num) {
        Node newNode = new Node(num);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
    }

    /**
     * Inserts a new node at the end of the list.
     *
     * @param num the integer value to insert
     */
    public void insertLast(int num) {
        Node newNode = new Node(num);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
    }

    /**
     * Inserts a new node after the first node containing the specified value.
     *
     * @param numToFind the value to search for
     * @param newNumber the value to insert after numToFind
     * @return true if insertion succeeded, false if numToFind was not found
     */
    public boolean insertAfter(int numToFind, int newNumber) {
        if (isEmpty()) return false;

        Node current = first;

        while (current != null && current.mData != numToFind) {
            current = current.next;
        }

        if (current == null) return false;

        Node newNode = new Node(newNumber);
        Node nextNode = current.next;

        newNode.previous = current;
        newNode.next = nextNode;
        current.next = newNode;

        if (nextNode != null) {
            nextNode.previous = newNode;
        } else {
            last = newNode;
        }

        return true;
    }

    /**
     * Deletes the first node in the list.
     *
     * @return the deleted node, or null if the list was empty
     */
    public Node deleteFirstNode() {
        if (isEmpty()) return null;

        Node temp = first;

        if (first == last) {
            first = last = null;
        } else {
            first = first.next;
            first.previous = null;
        }

        return temp;
    }

    /**
     * Deletes the last node in the list.
     *
     * @return the deleted node, or null if the list was empty
     */
    public Node deleteLastNode() {
        if (isEmpty()) return null;

        Node temp = last;

        if (first == last) {
            first = last = null;
        } else {
            last = last.previous;
            last.next = null;
        }

        return temp;
    }

    /**
     * Deletes the node at the specified index (0-based).
     *
     * @param index the index of the node to delete
     * @return the deleted node, or null if index is invalid
     */
    public Node deleteSpecificNode(int index) {
        if (isEmpty() || index < 0) return null;

        Node current = first;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) return null;

        if (current == first) return deleteFirstNode();
        if (current == last) return deleteLastNode();

        Node prev = current.previous;
        Node next = current.next;

        prev.next = next;
        next.previous = prev;

        return current;
    }

    /**
     * Prints the list from head to tail, showing each node's index and value.
     */
    public void printForwardsWithIndex() {
        Node current = first;
        int index = 0;

        System.out.println("Linked List: Forward with indices:");

        while (current != null) {
            System.out.println("node [" + index + "]: " + current.mData);
            current = current.next;
            index++;
        }
    }

    /**
     * Prints the list from tail to head, using forward indices.
     */
    public void printBackwardsWithIndex() {
        Node current = last;

        int index = 0;
        Node temp = first;
        while (temp != null) {
            temp = temp.next;
            index++;
        }
        index--;

        System.out.println("Linked List: Backward with indices:");

        while (current != null) {
            System.out.println("node [" + index + "]: " + current.mData);
            current = current.previous;
            index--;
        }
    }
}
