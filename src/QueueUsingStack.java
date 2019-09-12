public class QueueUsingStack {

    public static void main(String[] args) {
        System.out.println("For example: Suppose we push \"a\", \"b, \"c\" to a stack. If we are trying to implement a queue and we call the dequeue method 3 times, we actually want the elements to come out in the order: \"a\", \"b, \"c\", which is in the opposite order they would come out if we popped from the stack. So, basically, we need to access the elements in the reverse order that they exist in the stack. The following algorithm will implement a queue using two stacks.\n" +
                "\n" +
                "(1) When calling the enqueue method, simply push the elements into the stack 1.\n" +
                "(2) If the dequeue method is called, push all the elements from stack 1 into stack 2, which reverses the order of the elements. Now pop from stack 2.");
    }
}
