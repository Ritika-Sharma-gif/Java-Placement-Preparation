public class SimpleQueue {
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int value) {
        if(rear == queue.length -1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = value;

    }
    void dequeue() {
        if(front > rear) {
            System.out.println("Queue is empty");
            return;

        }
        System.out.println("Removed: " + queue[front]);
        front++;
    }
    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
        q.display();
    }
}