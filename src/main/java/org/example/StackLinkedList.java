package org.example;

class Node {
    int data;
    node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private node top;

    public Stack() {
        this.top = null;
    }

    // Method to add an element to the stack
    public void push(int data) {
        node newNode = new node(data);
        newNode.next = this.top;
        this.top = newNode;
    }

    // Method to remove and return the top element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return Integer.MIN_VALUE;
        }
        int popped = this.top.data;
        this.top = this.top.next;
        return popped;
    }

    // Method to return the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek");
            return Integer.MIN_VALUE;
        }
        return this.top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (this.top == null);
    }

    // Method to print the stack
    public void display() {
        node current = this.top;
        if (current == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(11);
        stack.push(21);
        stack.push(31);
        stack.push(41);
        stack.push(51);
        stack.push(61);
        stack.push(71);
        stack.push(81);
        stack.push(91);

        stack.display();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
    }
}

