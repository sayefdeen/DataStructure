package RandomProblems;

import java.util.Stack;

public class SortStack {
     static Stack<Integer> sortStack(Stack<Integer> stack){
         Stack<Integer> sorted = new Stack<>();

         while (!stack.isEmpty()){
             if(sorted.isEmpty()){
                 sorted.push(sorted.pop());
                 continue;
             }

             int temp = stack.pop();

             while (!sorted.isEmpty() && sorted.peek() < stack.peek()){
                 stack.push(sorted.pop());
             }
             sorted.push(temp);
         }

         return sorted;
     }
}
