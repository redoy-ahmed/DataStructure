package com.redoy.ds;

public class Queue {

    static final int MAX = 1000;
    private int arr[] = new int[MAX];
    private int front = 0;
    private int rear;
    private int count = 0;

    // Constructor to initialize queue
    Queue() {
        rear = -1;
    }

    // Utility function to remove front element from the queue
    public void dequeue() {
        // check for queue underflow
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % MAX;
        count--;
    }

    // Utility function to add an item to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % MAX;
        arr[rear] = item;
        count++;
    }

    // Utility function to return front element in the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        return (size() == 0);
    }

    // Utility function to check if the queue is empty or not
    public Boolean isFull() {
        return (size() == MAX);
    }


    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}
