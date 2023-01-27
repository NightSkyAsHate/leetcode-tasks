import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        isValid("()");
        isValid("()[]{}");
        isValid("(]");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            switch (c) {
                case ')':
                    if (stack.size() == 0 || stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.size() == 0 || stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':
                    if (stack.size() == 0 || stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                    break;
                default:
                    stack.push(c);
            }
        }
        return stack.size() == 0;
    }
}
