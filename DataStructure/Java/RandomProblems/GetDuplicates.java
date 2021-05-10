package RandomProblems;


// Get the duplicates values inside an array with O(1) time complexity

import java.util.ArrayList;
import java.util.List;

public class GetDuplicates {
     static List<Integer> getDuplicates(List<Integer> list){
        List<Integer> newList =new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            int j = Math.abs(list.get(i));
            if(list.get(j) >= 0){
                list.set(j,-list.get(j));
            }else{
                newList.add(j);
            }
        }
        return newList;
    }
}
