package HackerRank.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> output = new ArrayList<>();

        for (String query : queries) {
            int count = 0;
            for (String string : strings) {
                if (query.equals(string)) {
                    count++;
                }
            }
            output.add(count);
        }
        return output;
    }
}
