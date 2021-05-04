package HackerRank.Stack;

import java.util.List;
import java.util.Stack;

public class EqualStacks {

    // O(n) solution Timeout error
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        int sum1,sum2,sum3;
        sum1 = sum2 = sum3 = 0;

        for(int i = h1.size()-1; i>=0;i--){
            sum1+=h1.get(i);
            s1.push(sum1);
        }

        for(int i = h2.size()-1; i>=0;i--){
            sum2+=h2.get(i);
            s2.push(sum2);
        }

        for(int i = h3.size()-1; i>=0;i--){
            sum3+=h3.get(i);
            s3.push(sum3);
        }

        while(true){
            if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()){
                return 0;
            }

            int number1 = s1.peek();
            int number2 = s2.peek();
            int number3 = s3.peek();

            if(number1 == number2 && number2 == number3){
                return number1;
            }

            if(number1 > number2 && number1 > number3){
                s1.pop();
            }else if(number2 > number3 && number2 > number1){
                s2.pop();
            } else if(number3 > number1 && number3 > number1){
                s3.pop();
            }
        }

    }
    // Working Solution
    public static int equalStacks1(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        int sum1,sum2,sum3;
        sum1 = sum2 = sum3 = 0;

        for(int i = h1.size()-1; i>=0;i--){
            s1.push(h1.get(i));
            sum1+=h1.get(i);
        }

        for(int i = h2.size()-1; i>=0;i--){
            s2.push(h2.get(i));
            sum2+=h2.get(i);
        }

        for(int i = h3.size()-1; i>=0;i--){
            s3.push(h3.get(i));
            sum3+=h3.get(i);
        }

        int minSum = Math.min(sum1,Math.min(sum2,sum3));

        while(sum1 != sum2 || sum1 != sum3){
            while(sum1 > minSum){
                sum1-=s1.pop();
            }

            minSum = Math.min(sum1,Math.min(sum2,sum3));

            while(sum2 > minSum){
                sum2-= s2.pop();
            }

            minSum = Math.min(sum1,Math.min(sum2,sum3));

            while(sum3 > minSum){
                sum3-= s3.pop();
            }

            minSum = Math.min(sum1,Math.min(sum2,sum3));
        }
        return minSum;

    }


}
