package Stack;

public class insertSort {
    public static void insertionSort(int array[]){
        for(int counter=0;counter<array.length;counter++){
            int key = array[counter];
            int i = counter -1;
            while(i>=0 && array[i]>key){
                array[i+1] = array[i];
                i = i -1;
            }
            array[i+1] = key;
        }
    }

    public static void printArray(int array[]){
        for(int counter=0;counter<array.length;counter++){
            System.out.println(array[counter]);
        }
    }

    public static void main(String[] args){
        int array[] = {9,4,3,2,9,6};
        insertionSort(array);
        printArray(array);
    }
}
