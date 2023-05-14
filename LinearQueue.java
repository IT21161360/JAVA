public class LinearQueue {
    private int front;
    private int rear;
    private int queueArrry[];
    private int nItems;
    private int maxSize;

    public LinearQueue(int size) {
        maxSize = size;
        queueArrry = new int[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public void insert(int increment) {
        if (nItems == maxSize) {
            System.out.println("The queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArrry[++rear] = increment;
            nItems++;

        }
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("The queue is empty");
            return -99;
        } else {
            int tempQueue = queueArrry[front];
            if (front == maxSize - 1) {
                front = 0;
                nItems--;
                return tempQueue;
            }
            nItems--;
            return queueArrry[front++];
        }
    }

    public int peekFront() {
        if (nItems == 0) {
            return -99;
        } else {
            return queueArrry[front];
        }
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (nItems == maxSize) {
            return true;
        } else {
            return false;
        }

    }

}

class LinearQueueMainClass {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        System.out.println(queue.peekFront());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }

}
