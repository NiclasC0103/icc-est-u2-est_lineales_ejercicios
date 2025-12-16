package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean isPalindrome(String input) {
        Queue<Character> originalQueue = new LinkedList<>();
        Queue<Character> reversedQueue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            originalQueue.add(c);
        }

        // Construir la cola invertida
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedQueue.add(input.charAt(i));
        }

        // Comparar
        while (!originalQueue.isEmpty()) {
            if (!originalQueue.poll().equals(reversedQueue.poll())) {
                return false;
            }
        }

        return true;
    }
}

