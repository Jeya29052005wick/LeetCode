import java.util.Scanner;
import java.util.Stack;

public class Braces {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // no opening brace for this closing one
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }
        return stack.isEmpty(); // valid only if nothing left unclosed
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter braces: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("Correct - Properly nested.");
        } else {
            System.out.println("Wrong - Not properly nested.");
        }

        sc.close();
    }
}
