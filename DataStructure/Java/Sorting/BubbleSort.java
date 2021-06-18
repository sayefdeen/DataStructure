package Sorting;

public class BubbleSort {

    public void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean isSorted = true;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
    }

    private void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
