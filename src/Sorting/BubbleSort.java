package Sorting;

public class BubbleSort {
    public static void main(String args[]){
        int array[] = new int[]{3,2,1,5,4};
        array = bubbleSort(array);
        for(int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }

    static int[] bubbleSort(int[] array){
        int n = array.length;
        for(int i = 0 ; i < n ; i++){
            boolean sorted = false;  // This boolean flag is used to check the array is already sorted in the given iteration.
            for(int j = 1 ; j < n ; j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
        return array;
    }
}
