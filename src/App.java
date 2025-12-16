import java.util.Stack;
import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        runSingValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSingValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));

        System.out.println();
    }

    private static void runStackSorter() {
        System.out.println("=== Ejercicio 02: Ordenar Stack ===");

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack original: " + stack);

        StackSorter sorter = new StackSorter();
        sorter.sort(stack);

        System.out.println("Stack ordenado: " + stack);
        System.out.println();
    }

    private static void runQueuePalindrome() {
        System.out.println("=== Ejercicio 03: Palíndromo con Colas ===");

        QueueUtils queueUtils = new QueueUtils();

        String palabra1 = "ana";
        String palabra2 = "radar";
        String palabra3 = "java";

        System.out.println("¿\"" + palabra1 + "\" es palíndromo? " 
                + queueUtils.isPalindrome(palabra1));

        System.out.println("¿\"" + palabra2 + "\" es palíndromo? " 
                + queueUtils.isPalindrome(palabra2));

        System.out.println("¿\"" + palabra3 + "\" es palíndromo? " 
                + queueUtils.isPalindrome(palabra3));

        System.out.println();
    }
}
