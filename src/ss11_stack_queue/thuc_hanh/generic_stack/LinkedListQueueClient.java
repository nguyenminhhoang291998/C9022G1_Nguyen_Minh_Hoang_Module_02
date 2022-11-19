package ss11_stack_queue.thuc_hanh.generic_stack;

import ss11_stack_queue.thuc_hanh.generic_queue.MyLinkedListQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        queue.dequeue();

        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
