import java.util.Stack;

/**
 * Created by Toda Erika on 4/22/2016.
 */
public class ValidPalindrome2 {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int len = s.length();
        if (len < 2)
            return true;

        Stack<Character> stack = new Stack<Character>();

        int index = 0;
        while (index < len / 2) {
            stack.push(s.charAt(index));
            index++;
        }

        if (len % 2 == 1)
            index++;

        while (index < len) {
            if (stack.empty())
                return false;

            char temp = stack.pop();
            if (s.charAt(index) != temp)
                return false;
            else
                index++;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "1,,a1";
        ValidPalindrome2 vp2 = new ValidPalindrome2();
        if(vp2.isPalindrome(palindrome)) {
            System.out.println("It is palindrome!");
        }
        else
            System.out.println("It is NOT palindrome!");
    }
}
