package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 10, 0, 5, 15, 7, 8, 6};
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int a = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[a] = left[l++];
            } else {
                arr[a] = right[r++];
            }
            a++;
        }

        while (l < left.length) {
            arr[a++] = left[l++];
        }

        while (r < right.length) {
            arr[a++] = right[r++];
        }

    }

    public void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(arr, 0, left, 0, left.length);
        for (int i = mid, count = 0; count <right.length ; i++,count++) {
            right[count] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
}
