package RandomProblems;


// Get the duplicates values inside an array with O(1) time complexity

import java.util.ArrayList;
import java.util.Hashtable;
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

    static List<Integer> getDuplicatesUsingHash(List<Integer> list){
        List<Integer> newList =new ArrayList<>();
        Hashtable<Integer,Integer> hashtable =new Hashtable<>();
        for (int j:list ) {
            int counter = 0;
            if(hashtable.get(j) != null){
                counter = hashtable.get(j);
            }
            hashtable.put(j,++counter);
            if(hashtable.get(j) >1){
                list.add(j);
            }
        }
        return newList;
    }
}
