package com.redoy.ds;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enQueue(int x) {
        // Push item into s1
        s1.push(x);
    }

    // Dequeue an item from the queue
    static int deQueue() {
        if (s2.isEmpty()) {
            if (!s1.isEmpty())
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            else {
                System.out.println("Q is Empty");
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {

        System.out.println("For example: Suppose we push \"a\", \"b, \"c\" to a stack. If we are trying to implement a queue and we call the dequeue method 3 times, we actually want the elements to come out in the order: \"a\", \"b, \"c\", which is in the opposite order they would come out if we popped from the stack. So, basically, we need to access the elements in the reverse order that they exist in the stack. The following algorithm will implement a queue using two stacks.\n" +
                "\n" +
                "(1) When calling the enqueue method, simply push the elements into the stack 1.\n" +
                "(2) If the dequeue method is called, push all the elements from stack 1 into stack 2, which reverses the order of the elements. Now pop from stack 2.");

        enQueue(1);
        enQueue(2);
        enQueue(3);

        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
    }
}
