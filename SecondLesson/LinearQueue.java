package SecondLesson;

public class LinearQueue {
    private int maxSize;
    private int nItems;
    private int queueArray[];
    private int front;
    private int rear;

    public LinearQueue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        nItems=0;
        front=0;
        rear=-1;
    }

    public void insert(int increment){
        if(rear==maxSize-1){
            System.out.println("The queue is full");
        }else{
            queueArray[++rear] = increment;
            nItems++;
        }
    }

    public int remove(){
        if(nItems==0){
            System.out.println("The queue is empty");
            return -99;
        }else{
            nItems--;
            return queueArray[front++];
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
        if(rear==maxSize-1){
            System.out.println("The queue is full");
            return true;
        }else{
            return false;
        }
    }


}


class MainQueue{
    public static void main(String[] args){
        LinearQueue queue = new LinearQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.println(queue.peekFront());

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
