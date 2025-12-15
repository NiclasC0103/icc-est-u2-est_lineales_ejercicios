package utils;

import java.util.Stack;

public class SignValidator {
    
    public boolean isValid(String signos){
        Stack<Character> stack = new Stack<>();
        for (Character character : signos.toCharArray()) {
            // character -> {
            // character -> }
            // 1 --> Comprobar si es de apertura o cierre
            if(getIsApertura(character)){
                stack.push(character);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop();
                //ultimo es del mismo tipo que character?
                boolean mismoTipo = isTipoIgual(character, ultimo);
                if (mismoTipo == false){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(char c){
        return c=='{' || c=='(' || c=='[';
    }

    private boolean isTipoIgual(char c, char ultimo){
        return (c==')' && ultimo=='(') || (c=='}' && ultimo=='{')  || (c==']' && ultimo=='[');
    }
}
