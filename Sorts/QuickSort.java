package Sorts;

public class QuickSort {

    public static void quickSort(int array[],int low,int high){
        if(low<high){
        int pivortIndex = partition(array,low,high);
        quickSort(array, low, pivortIndex-1);
        quickSort(array, pivortIndex+1, high);
        }
    }

    private static int partition(int array[],int low,int high){
        int x = array[high];
        int i = low -1;
        for(int counter=low;counter<high;counter++){
            if(array[counter]<=x){
                i = i+1;
                swap(array,i,counter);
            }
        }
        swap(array,i+1,high);
        return i+1;
    }


    public static void  swap(int array[],int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
         int array[] = {6,8,9,2,3,4};
         quickSort(array, 0, 5);
         printArray(array);
    }


    public static void printArray(int array[]){
        for(int counter=0;counter<array.length;counter++){
            System.out.print(array[counter]);
        }
    }


    
}
