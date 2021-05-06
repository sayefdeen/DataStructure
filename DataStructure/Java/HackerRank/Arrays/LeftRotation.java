package HackerRank.Arrays;

import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        while(d != 0){
            int firstEle = arr.remove(0);
            arr.add(firstEle);
            d--;
        }
        return arr;

    }
}
