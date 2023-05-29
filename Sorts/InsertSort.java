package Sorts;

public class InsertSort {
    public static void insertSort(int array[]){
        for(int counter=1;counter<array.length;counter++){
            int key = array[counter];
            int i = counter-1;
            while(i>=0 && array[i]>key){
                array[i+1] = array[i];
                i = i-1;
            }
         array[i+1] = key;
        }
    }
    

    public static void main (String[] args){

        int array[] = {4,1,7,2,3,5};
        insertSort(array);
        printArray(array);
    }

    public static void printArray(int array[]){
        for(int counter=0;counter<array.length;counter++){
             System.out.print(array[counter]);
        }
    }
}
