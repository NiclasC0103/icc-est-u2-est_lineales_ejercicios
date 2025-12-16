package utils;

import java.util.Stack;

public class StackSorter {
    public void sort(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }
            
            sortedStack.push(temp);
        }
        
        // Transferir los elementos ordenados al stack original
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }
}

