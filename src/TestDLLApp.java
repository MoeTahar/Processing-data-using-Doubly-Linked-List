
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

public class TestDLLApp {

    /**
     * Entry point of the program.
     * Builds a doubly linked list and performs all required operations.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(74);
        list.insertFirst(97);

        list.insertLast(9);
        list.insertLast(33);
        list.insertLast(55);

        list.printForwardsWithIndex();
        list.printBackwardsWithIndex();

        list.deleteFirstNode();
        list.deleteLastNode();
        list.deleteSpecificNode(3);

        System.out.println("\nAfter deletions:");
        list.printForwardsWithIndex();

        list.insertAfter(22, 69);
        list.insertAfter(33, 88);

        System.out.println("\nAfter insertions:");
        list.printForwardsWithIndex();
    } // End of main method
} // End of TestDLLApp class
