package Tute2;
public class Question4 {
    private int queueArray[];
    private int maxSize;
    private int front;
    //private int rear;
    private int nItems;

    public Question4(int size){
        maxSize =size;
        queueArray = new int[maxSize];
        nItems=0;
        front=0;
        //rear=-1;
    }

    public int remove(){
       if(nItems==0){
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
}
