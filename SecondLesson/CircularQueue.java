package SecondLesson;

public class CircularQueue {

    private int maxSize;
    private int nItems;
    private int queueArray[];
    private int front;
    private int rear;

    public CircularQueue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        nItems=0;
        front=0;
        rear=-1;
    }

    public void insert(int increment){
        if(nItems==maxSize){
            System.out.println("The queue is full");
        }else{
            if(rear==maxSize-1){
                rear = -1;
            }
            queueArray[++rear]=increment;
            nItems++;
        }
    }

    public int remove(){
        if(nItems==0){
            System.out.println("The queue is empty");
            return -99;
        }else{
            int temp = queueArray[front];
            nItems--;
            if(front==maxSize-1){
                front=0;
                return temp;
            }else{
                return queueArray[front++];
            }
        }
    }

    public int peekFront(){
        if(nItems==0){
            System.out.println("The queue is empty");
            return -99;
        }else{
            return queueArray[front];
        }
    }

    public boolean isEmpty(){
        if(nItems==0){
            System.out.println("The queue is empty");
            return true;
        }else{
            return false;
        }
    }

    
    public boolean isFull(){
        if(nItems==maxSize){
            System.out.println("The queue is full");
            return true;
        }else{
            return false;
        }
    }

}

class MainCircularQueue{
    public static void main(String[] args){
        CircularQueue squeue = new CircularQueue(5);

        squeue.insert(1);
        squeue.insert(2);
        squeue.insert(3);
        squeue.insert(4);
        squeue.insert(5);

        System.out.println(squeue.peekFront());

        while(!squeue.isEmpty()){
            System.out.println(squeue.remove());
        }
    }
}

