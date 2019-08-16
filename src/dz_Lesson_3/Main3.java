package dz_Lesson_3;


import dz_Lesson_3.queue.Dequeue;
import dz_Lesson_3.stack.Stack;
import dz_Lesson_3.stack.StackImpl;

public class Main3 {

    public static void main(String[] args) {
        testDequeue(9);
//        testStack();
//        Queue<Integer> queue = new QueueImpl<>(5);
//        Queue<Integer> queue = new PriorityQueue<>(5);
//        queue.insert(3);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(4);
//        System.out.println("Top of queue is " + queue.peek());
//        System.out.println("queue size is " + queue.size());
//
//        while ( !queue.isEmpty() ) {
//            System.out.println(queue.remove());
//        }
//        Stack<Integer> stack = new StackImpl<>(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack.size());
//        stack.pop();
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
    }

    private static void testStack() {
        Stack<Integer> stack = new StackImpl<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Top of stack is " + stack.peek());
        System.out.println("stack size is " + stack.size());

        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }
    private static void testDequeue(int maxCapacity){
        Dequeue<Integer> dequeue = new Dequeue<>(maxCapacity);

        dequeue.insertRight(100);
        dequeue.insertRight(200);
        dequeue.insertRight(300);
        dequeue.insertRight(400);
        dequeue.insertRight(500);
        dequeue.insertLeft(1000);
        dequeue.insertLeft(2000);
        dequeue.removeLeft();
        dequeue.removeLeft();
        dequeue.removeLeft();
        dequeue.removeLeft();

        System.out.println("dequeue size is " + dequeue.size());
        System.out.println("______________");
        while ( !dequeue.isEmpty() ) {
            System.out.println(dequeue.removeLeft());
        }
    }


}