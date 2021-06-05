package LeetCode.Arrays;

public class Q1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for(int i = 0;i<l;i++){
            int end = i+1;
            int start = l-i;
            int total = start *end;
            int odd = total/2;
            if(total % 2 ==1){
                odd++;
            }
            sum += odd * arr[i];
        }
        return sum;
    }
}
