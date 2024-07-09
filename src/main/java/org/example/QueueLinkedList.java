package org.example;

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Method to add an element to the queue
    public void enQueue(int data) {
        node newNode = new node(data);

        // If queue is empty, then new node is both front and rear
        if (isEmpty()) {
            this.front = this.rear = newNode;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Method to remove an element from queue
    public void deQueue() {
        // If queue is empty, return null
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            return;
        }

        // Store the previous front and move front one node ahead
        node temp = this.front;
        this.front = this.front.next;

        // If front becomes null, then change rear also as null
        if (this.front == null) {
            this.rear = null;
        }

        System.out.println("Dequeued element: " + temp.data);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (this.front == null);
    }

    // Method to print the queue
    public void display() {
        node current = this.front;
        if (current == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(11);
        queue.enQueue(21);
        queue.enQueue(31);
        queue.enQueue(41);
        queue.enQueue(51);
        queue.enQueue(61);
        queue.enQueue(71);
        queue.enQueue(81);
        queue.enQueue(91);

        queue.display();

        queue.deQueue();
        queue.display();

        queue.deQueue();
        queue.display();

        queue.deQueue();
        queue.display();
    }
}
