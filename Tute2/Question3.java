package Tute2;

class Stack {
    //private int queueArray[];
    private int maxSize;
    //private int front;
    //private int rear;
    private int nItems;

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

class Question3 {

    // i
    /*
     * public boolean isEmpty(){
     * if(nItems==0){
     * return true;
     * }else{
     * return false;
     * }
     * }
     * 
     * public boolean isFull(){
     * if(nItems==maxSize){
     * return true;
     * }else{
     * return false;
     * }
     * }
     * 
     */

    // ii
    /*
     * myQueue.insert('i');
     * myQueue.insert('m');
     * myQueue.insert('n');
     * myQueue.insert('o');
     */

     //iii
     /* while(!myQueue.isEmpty()){
         System.out.println(myQueue.remove());
     } */

}
