class Queue {
    private int front;
    private int rear;
    private int queueArrry[];
    private int nItems;
    private int maxSize;

    public Queue(int size) {
        maxSize = size;
        queueArrry = new int[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public void insert(int increment) {
        if (rear == maxSize - 1) {
            System.out.println("The queue is full");
        } else {
            queueArrry[++rear] = increment;
            nItems++;
        }
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("The queue is empty");
            return -99;
        } else {

            nItems--;
            return queueArrry[front++];

        }
    }

    public int peekFront() {
        if (nItems == 0) {
            System.out.println("The queue is empty");
            return -99;
        } else {
            return queueArrry[front];
        }
    }

    public int peekRear() {
        return rear;
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

}

class queueMainClass {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.println(queue.peekFront());
        System.out.println(queue.peekRear());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}
