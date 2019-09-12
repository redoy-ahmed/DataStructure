package com.redoy.ds;

public class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of com.redoy.ds.Stack

    // Constructor to initialize stack
    Stack() {
        top = -1;
    }

    // Utility function to check if stack is empty
    boolean isEmpty() {
        return (top < 0);
    }

    // Utility function to push item in stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("com.redoy.ds.Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    // Utility function to pop top item of stack
    int pop() {
        if (top < 0) {
            System.out.println("com.redoy.ds.Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    // Utility function to return top item of stack
    int peek() {
        if (top < 0) {
            System.out.println("com.redoy.ds.Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Top item in stack");
    }
}
