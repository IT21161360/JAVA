package INSERTSORT;
public class InsertSort {


    public static void newInsertSort(int array[]) {
        for (int counter = 1; counter < array.length; counter++) {
            int i = counter - 1;
            while (i >= 0 && array[counter] < array[i]) {
                i--;
            }
            int key = array[counter];
            for (int k = counter; k > i + 1; k--) {
                array[k] = array[k - 1];
            }
            array[i + 1] = key;
        }
    }
    

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

    public static void printArray(int array[]){
        for(int counter=0;counter<array.length;counter++){
            System.out.print(array[counter]+" ");


        }
    }

    public static void main(String[] args){
        int array[] = {9,8,7,6,5,4,3,2};
        System.out.println("\n");
        newInsertSort(array);
        printArray(array);
    }
}
