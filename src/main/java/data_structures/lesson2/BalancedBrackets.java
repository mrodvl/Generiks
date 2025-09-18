package data_structures.lesson2;

import data_structures.lesson1.MyStack;

public class BalancedBrackets {

    public static boolean isBalanced(String input) {
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                char x = stack.pop();
                if(x == '(' && c != ')' || x == '[' && c != ']' || x == '{' && c != '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
