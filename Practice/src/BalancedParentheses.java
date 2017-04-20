import java.util.Stack;

/**
 * Created by sunl on 4/5/16.
 */
public class BalancedParentheses {

    public boolean validateParentheses(String s) {

        Stack<Character> st = new Stack<Character>();
        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                st.push(')');
            }
            else if(ch == '[') {
                st.push(']');
            }
            else if(ch == '{') {
                st.push('}');
            }
            else if(st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String parentheses = "([])()[]{}";
        BalancedParentheses bp = new BalancedParentheses();
        if(bp.validateParentheses(parentheses)) {
            System.out.println("It is balanced!");
        }
        else
            System.out.println("It is NOT balanced!");
    }
}
