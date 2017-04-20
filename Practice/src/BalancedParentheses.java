import java.util.HashMap;

/**
 * Created by sunl on 4/5/16.
 */
public class BalancedParentheses {

    public boolean validateParentheses(String parentheses) {

        if(parentheses == null || parentheses == "") {
            return true;
        }
        char[] input = parentheses.toCharArray();
        char firstElement = input[0];
        if(firstElement == ')'|| firstElement == ']'|| firstElement == '}') {
            return false;
        }
        else {
            HashMap hm = new HashMap();
            hm.put("(", new Integer(0));
            hm.put("[", new Integer(0));
            hm.put("{", new Integer(0));
            int counter1 = (Integer) hm.get("(");
            int counter2 = (Integer) hm.get("[");
            int counter3 = (Integer) hm.get("{");
            for(int i=0; i<parentheses.length(); i++) {
                if(input[i]=='(') {
                    hm.put("(", new Integer(counter1++));
                    continue;
                }
                if(input[i]==')') {
                    hm.put("(", new Integer(counter1--));
                    if(counter1 >= 0) {
                        continue;
                    }
                    else
                        return false;
                }
                if(input[i]=='[') {
                    hm.put("[", new Integer(counter2++));
                    continue;
                }
                if(input[i]==']') {
                    hm.put("[", new Integer(counter2--));
                    if(counter2 >= 0) {
                        continue;
                    }
                    else
                        return false;
                }
                if(input[i]=='{') {
                    hm.put("{", new Integer(counter3++));
                    continue;
                }
                if(input[i]=='}') {
                    hm.put("{", new Integer(counter3--));
                    if(counter3 >= 0) {
                        continue;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
            if(counter1 % 2 == 0 && counter2 % 2 == 0 && counter3 % 2 == 0) {
                return true;
            }
            else
                return false;
        }

    }

    public static void main(String[] args) {
        String parentheses = "(({)})";
        BalancedParentheses bp = new BalancedParentheses();
        if(bp.validateParentheses(parentheses)) {
            System.out.println("It is balanced!");
        }
        else
            System.out.println("It is NOT balanced!");
    }
}
