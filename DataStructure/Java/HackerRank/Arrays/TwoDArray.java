package HackerRank.Arrays;

import java.util.List;

public class TwoDArray {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int rows = arr.size();
        int columns = arr.get(0).size();
        int max = -63;

        for(int i = 0; i< rows -2 ; i++){
            for(int j = 0; j< columns-2;j++){
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
