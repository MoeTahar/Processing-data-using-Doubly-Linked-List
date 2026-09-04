# Doubly Linked List – Java Implementation

A Java implementation of a Doubly Linked List demonstrating insertion, deletion, and forward/backward traversal.  
This project contains two main classes:

- 'TestDLLApp' — the driver program  
- 'DoublyLinkedList' — the full linked list implementation (with internal 'Node' class)

---

## Overview

This project builds a custom Doubly Linked List and performs a sequence of operations including:

- Inserting nodes at the beginning and end  
- Printing the list forward and backward with indices  
- Deleting nodes (first, last, and by index)  
- Inserting nodes after specific values  

The goal is to demonstrate how doubly linked lists store data and allow traversal in both directions.

---

## Classes Included

### 1. TestDLLApp

The main driver class responsible for:

- Creating a 'DoublyLinkedList'  
- Inserting initial values  
- Printing the list forward and backward  
- Deleting nodes  
- Inserting new nodes after specific values  

---

### 2. DoublyLinkedList

Implements all core linked‑list functionality:

- 'insertFirst(int num)' — insert at the head  
- 'insertLast(int num)' — insert at the tail  
- 'insertAfter(int numToFind, int newNumber)' — insert after a specific value  
- 'deleteFirstNode()' — remove the first node  
- 'deleteLastNode()' — remove the last node  
- 'deleteSpecificNode(int index)' — remove a node by index  
- 'printForwardsWithIndex()' — print from head to tail  
- 'printBackwardsWithIndex()' — print from tail to head  

Internal pointers:

- 'first' — head of the list  
- 'last' — tail of the list  

---

### 3. Node

Represents each element in the list.

Each node stores:

- 'mData' — integer value  
- 'next' — pointer to next node  
- 'previous' — pointer to previous node  

---

# Processing-data-using-Doubly-Linked-List
Processing data using Doubly Linked List 
