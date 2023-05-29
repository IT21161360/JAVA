package Sorts;

public class MergeSort {

    public static void mergeSort(int array[],int low,int high){

        if(low<high){
        int mid = low + (high-low) / 2;
        mergeSort(array, low, mid);
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
            right[j] = array[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=low;

        while(i<leftSize && j<rightSize){
            if(left[i]<=right[j]){
                array[k++] = left[i++];
            }else{
                array[k++] = right[j++];
            }
        }

        while(i<leftSize){
            array[k++] = left[i++];
        }

        while(j<rightSize){
            array[k++] =right[j++];
        }

    }


    public static void main(String[] args){

        int array[] = {2,3,4,1,8,5,3,33};
        mergeSort(array, 0, 7);
        printArray(array);
    }

    public static void printArray(int array[]){
        for(int counter=0;counter<array.length;counter++){
            System.out.print(array[counter]+" ");
        }
    }
    
}
