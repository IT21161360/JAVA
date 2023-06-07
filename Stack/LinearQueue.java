package Stack;

public class LinearQueue {

    private int queueArray[];
    private int maxSize;
    private int nItems;
    private int front;
    private int rear;

    public LinearQueue(int s){
        maxSize=s;
        queueArray = new int[maxSize];
        rear=-1;
        front=0;
        nItems=0;
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
            if(nItems==0){
                System.out.println("The queue is empty");
                return true;
             }else{
                return false;
    }
}

 

}


class Main2{
    public static void main(String[] args){
        LinearQueue queue = new LinearQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
