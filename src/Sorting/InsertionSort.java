package Sorting;

public class InsertionSort {
    public static void main(String strs[]){
        int array[] = new int[]{3,2,5,4,1};
        int length = array.length;
        for(int i = 1 ; i < length ; i++){
            int insertionValue = array[i];
            int j = i-1;
            while(j >=0 && array[j] > insertionValue){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = insertionValue;
       }
        for(int i = 0 ; i < length ; i++){
            System.out.println(array[i]);
        }
    }
}