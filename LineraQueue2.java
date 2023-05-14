class LinearQueue2{
    private int queueArray[];
    private int maxSize;
    private int nItems;
    private int front;
    private int rear;

    public LinearQueue2(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        nItems =0;
        front=0;
        rear=-1;
    }
    public int peekFront(){
        if(nItems==0){
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
            System.out.println(rear);
            return true;
        }else{
            return false;
        }
    }

    public int remove(){
        if(nItems==0){
            System.out.println("The queue is empty");
            return -99;
        }else{
            int tempQueue = queueArray[front];
            if(front==maxSize-1){
                front=0;
                nItems--;
                return tempQueue;
            }else{
                nItems--;
                return queueArray[front++];
            }
        }
    }

    int number;
    public void displayQueue(){
        for(int counter=0;counter<queueArray.length;counter++){
            if(queueArray[counter]==0){
               System.out.println("This index is empty");
            }
            else{
                System.out.println(counter + " : " + queueArray[counter]);
            }
        }
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


  

}

class MainClass{
    public static void main(String[] args){
        LinearQueue2 queue = new LinearQueue2(8);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(14);
        queue.insert(29);
        queue.insert(33);
        queue.insert(88);

        System.out.println("The peek front :" + queue.peekFront());
        System.out.println("This is removed : " + queue.remove());
        System.out.println("This is removed : " + queue.remove());

        queue.insert(99);
        queue.insert(100);

        System.out.println("The peek front :" + queue.peekFront());

        queue.displayQueue();

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    
    }
}