package SatckImp.StackImpLL;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    static Stack<Integer> stack = new Stack<>();
    static List<Integer> array = List.of(1,5,6,7,9,8);

    @BeforeAll
    static void configure(){
        array.forEach(number->stack.push(number));
    }
    @Test
    @DisplayName("stack top equals to the last element in the array")
    public void Test1(){
        int result = stack.peek();
        assertEquals(array.get(array.size()-1),result);
    }

    @Test
    @DisplayName("peek method return the first element without removing it")
    public void Test2(){
        int peeked = stack.peek();
        int poped = stack.pop();
        assertEquals(peeked,poped);
    }

    @Test
    @DisplayName("Pop method removes the top of the stack")
    public void Test3(){
        int poped = stack.pop();
        int peeked = stack.peek();
        assertNotEquals(poped,peeked);
    }

    @Test
    @DisplayName("is Empty return false if the stack was empty")
    public void Test4(){
        assertFalse(stack.isEmpty());
    }

    @Test
    @DisplayName("Last Element in the stack equal to the first elment of the array")
    public void Test5(){
        int result = -1;
        while (!stack.isEmpty()){
            result = stack.pop();
        }
        assertEquals(array.get(0),result);
    }
}