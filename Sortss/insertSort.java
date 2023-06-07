package Sortss;

public class insertSort {
    public static void insertionSort(int array[]){
        for(int counter=1;counter<array.length;counter++){
            int key = array[counter];
            int i = counter-1;
            while(i>=0 && array[i]>key){
                array[i+1]=array[i];
                i=i-1;
            }
            array[i+1]=key;
        }
    }

    public static void mergeSort(int array[],int low,int high){
        if(low<high){
            int mid = low + (high-low) / 2;
            mergeSort(array, low,mid);
            mergeSort(array, mid+1, high);
            merge(array, low, mid, high);
        }
    }

    public static void merge(int array[],int low,int mid,int high){

         int leftSize = mid - low + 1;
         int rightSize = high - mid;

         int left[] = new int[leftSize];
         int right[] = new int[rightSize];

         for(int i=0;i<leftSize;i++){
            left[i] = array[low+i];
         }

         for(int j=0;j<rightSize;j++){
            right[j]= array[mid+1+j];
         }

         
         int i = 0;
         int j =0;
         int key=low;

         while(i<leftSize && j<rightSize){
            if(left[i]<=right[j]){
                array[key++] = left[i++];
            }else{
                array[key++] = right[j++];
            }
         }

         while(i<leftSize){
            array[key++] = left[i++];
         }

         while(j<rightSize){
            array[key++] = right[j++];
         }


    }

    public static void quickSort(int array[],int low,int high){
         if(low<high){
            int pivortIndex = partition(array,low,high);
            quickSort(array, low, pivortIndex-1);
            quickSort(array, pivortIndex+1, high);
         }
    }

    public static void swap(int array[],int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int array[],int low,int high){
        int x = array[high];
        int i = low-1;
        for(int counter=low;counter<high;counter++){
            if(array[counter]<=x){
                i = i + 1;
                swap(array, i, counter);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    public static void main(String[] args){

        int array[] = {2,3,4,1,8,5,3,33};
        System.out.print("hello");
        mergeSort(array, 0, 7);
        printArray(array);
    }

    public static void printArray(int array[]){
        for(int counter=0;counter<array.length;counter++){
            System.out.print(array[counter]+" ");
        }
    }
}
