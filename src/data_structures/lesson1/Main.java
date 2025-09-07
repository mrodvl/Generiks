package data_structures.lesson1;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // ожидаем 30
        System.out.println(stack.pop());  // ожидаем 30
        System.out.println(stack.pop());  // ожидаем 20
        System.out.println(stack.isEmpty()); // ожидаем false
        System.out.println(stack.pop());  // ожидаем 10
        System.out.println(stack.isEmpty()); // ожидаем true

    }
}
