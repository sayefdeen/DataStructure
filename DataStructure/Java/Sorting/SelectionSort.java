package Sorting;

public class SelectionSort {
    public void selectionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arr,i,minIndex);
            }
        }
    }

    private void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
