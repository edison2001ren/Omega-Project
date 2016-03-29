/**
 * Created by sunl on 3/29/16.
 */
public class BalancedParentheses {

    public static boolean validateParentheses(char[] parentheses) {

        if(parentheses == null || parentheses.length == 0) {
            return false;
        }
        int counter = 1;
        char firstElement = parentheses[0];
        if(firstElement == ')') {
            return false;
        }
        else {
            for(int i=1; i<parentheses.length; i++) {
                if(parentheses[i]==')') {
                    counter--;
                }
                else
                    counter++;
                if(counter<0) {
                    return false;
                }
            }
            if(counter!=0) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        char[] input = {'(', ')', '('};
        if(validateParentheses(input)) {
            System.out.println("It is balanced!");
        }
        else
            System.out.println("It is NOT balanced!");
    }
}
