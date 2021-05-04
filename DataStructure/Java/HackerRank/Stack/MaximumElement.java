package HackerRank.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumElement {
    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
        // Write your code here
        Stack<Integer> max = new Stack<>();
        Stack<Integer> main = new Stack<>();
        List<Integer> output = new ArrayList<>();


        for(int i = 0; i< operations.size();i++){
            String[] casese = operations.get(i).split(" ");
            String type = casese[0];
            int number = casese.length == 2 ?Integer.parseInt(casese[1]) :0;

            switch(type){
                case "1":
                    main.push(number);
                    if(max.isEmpty() || number >= max.peek()){
                        max.push(number);
                    }
                    break;
                case "2":
                    int out =  main.pop();
                    if(out == max.peek()){
                        max.pop();
                    }
                    break;
                case "3":
                    output.add(max.peek());
                    break;
            }
        }
        return output;

    }

}
