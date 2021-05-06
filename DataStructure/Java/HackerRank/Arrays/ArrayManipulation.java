package HackerRank.Arrays;

import java.util.List;

// using prefix sum algorithm

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        int[] arr = new int[n+1];
        for(int i = 0; i<queries.size();i++){
            arr[queries.get(i).get(0)-1]+=queries.get(i).get(2);
            arr[queries.get(i).get(1)]-=queries.get(i).get(2);
        }

        long sum = 0;
        long max = 0;

        for(int i = 0; i< n;i++){
            sum+=arr[i];
            max = Math.max(max,sum);
        }

        return max;



    }
}
