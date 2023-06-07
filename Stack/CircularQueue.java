package Stack;
public class CircularQueue {

    private int queueArray[];
    private int maxSize;
    private int nItems;
    private int front;
    private int rear;

    public CircularQueue(int s){
        maxSize = s;
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
                rear=-1;
            }
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
            int temp = queueArray[front];
            if(front==maxSize){
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
        nItems--;
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

class Main3{
    public static void main(String[] args){
        CircularQueue queue = new CircularQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}

