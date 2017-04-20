import java.util.Stack;
import java.util.HashMap;

/**
 * Created by sunl on 4/18/17.
 */
public class BalancedParentheses3 {

    private static final HashMap<Character, Character> hm = new HashMap<Character, Character>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};


    static String[] braces(String[] values) {

        int num_of_braces = Integer.parseInt(values[0]);
        String[] answer = new String[num_of_braces];

        for(int i=0; i<answer.length; i++) {
            boolean flag = true;
            String braces = values[i+1];
            Stack<Character> stack = new Stack<Character>();
            for(char c: braces.toCharArray()) {
                if(hm.containsKey(c)) {
                    stack.push(c);
                }
                else if(stack.isEmpty() || hm.get(stack.pop()) != c) {
                    flag = false;
                    break;
                }
            }
            if(stack.isEmpty() && flag == true) {
                answer[i] = "YES";
            }
            else if(!stack.isEmpty() || flag == false)
                answer[i] = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] parentheses = {"4", "{}[]()", "{[}]", "{}", "["};
        BalancedParentheses3 obj = new BalancedParentheses3();
        for(String s : obj.braces(parentheses)) {
            System.out.println(s);
        }
    }
}
