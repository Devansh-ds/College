import java.util.Scanner;

class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class MyQueue {
    private int[] arr;
    private int front, rear, capacity, size;

    public MyQueue(int size) {
        capacity = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class StackQueueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int stackSize = scanner.nextInt();
        MyStack stack = new MyStack(stackSize);

        System.out.print("Enter queue size: ");
        int queueSize = scanner.nextInt();
        MyQueue queue = new MyQueue(queueSize);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped from Stack: " + stack.pop());
        stack.display();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued from Queue: " + queue.dequeue());
        queue.display();

        scanner.close();
    }
}
