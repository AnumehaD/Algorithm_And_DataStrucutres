package Sorting;

public class SelectionSort {
    public static void main(String args[]){
        int array[]  = new int[]{5,4,1,3,2};
        int index = 0;
        for(int i = 0 ; i < array.length-1; i++){
            int selectedValue = array[i];
            for(int j = i+1 ; j < array.length ; j++){
                if(selectedValue > array[j]){
                    selectedValue = array[j];
                    index = j;
                }
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }

        }
        for(int i = 0; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
