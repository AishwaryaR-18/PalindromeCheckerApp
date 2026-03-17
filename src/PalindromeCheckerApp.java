//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static boolean reverseStringCheck(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return input.equals(reversed);
    }

    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        long start, end;

        start = System.nanoTime();
        boolean result1 = reverseStringCheck(input);
        end = System.nanoTime();
        System.out.println("Reverse String Method: " + result1 + " Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean result2 = stackCheck(input);
        end = System.nanoTime();
        System.out.println("Stack Method: " + result2 + " Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean result3 = dequeCheck(input);
        end = System.nanoTime();
        System.out.println("Deque Method: " + result3 + " Time: " + (end - start) + " ns");
    }
}