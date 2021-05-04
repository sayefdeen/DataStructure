package HackerRank.Stack;

import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (int i = 0; i <array.length ; i++) {
            char data = array[i];
            if(data == '(' || data == '{' || data == '['){
                stack.push(data);
                continue;
            }

            if(stack.isEmpty()){
                return "NO";
            }
            char check;
            switch (data){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[') return "NO";
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[') return "NO";
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{') return "NO";
                    break;
            }
        }
        return stack.isEmpty() ? "YES" : "NO" ;

    }
}
