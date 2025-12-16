package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {
    public boolean isPalindrome(String input) {
        Queue<Character> originalQueue = new LinkedList<>();
        Queue<Character> reversedQueue = new LinkedList<>();
        
        // Llenar la cola original y la invertida
        for (char c : input.toCharArray()) {
            originalQueue.add(c);
            reversedQueue.add(c);
        }
        
        // Comparar las dos colas
        while (!originalQueue.isEmpty()) {
            if (!originalQueue.poll().equals(reversedQueue.poll())) {
                return false;
            }
        }
        
        return true;
    }
}
