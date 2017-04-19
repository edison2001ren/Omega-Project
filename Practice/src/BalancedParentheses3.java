import java.util.HashMap;
import java.util.Stack;

/**
 * Created by sunl on 4/6/16.
 */
public class BalancedParentheses3 {

    private static final HashMap<Character, Character> hm = new HashMap<Character, Character>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || hm.get(stack.pop()) != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String parentheses = "{[}]";
        BalancedParentheses3 bp = new BalancedParentheses3();
        if(bp.isValid(parentheses)) {
            System.out.println("It is balanced!");
        }
        else
            System.out.println("It is NOT balanced!");
    }
}
