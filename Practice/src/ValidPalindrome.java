import java.util.Stack;

/**
 * Created by Toda Erika on 4/21/2016.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        String newString = "";
        for(char c: s.toCharArray()) {
            if(c>='a'&&c<='z') {
                newString += Character.toUpperCase(c);
            }
            else if(c>='A'&&c<='Z') {
                newString += c;
            }
            else if(c>='0'&&c<='9') {
                newString += c;
            }
        }
        if(newString.length() < 2) {
            return true;
        }
        else {
            Stack<Character> charStack = new Stack<Character>();
            char[] charArray = newString.toCharArray();
            for(int i = 0; i< charArray.length/2; i++) {
                charStack.push(charArray[i]);
            }
            int halfIndex;
            if(charArray.length%2==0) {
                halfIndex = charArray.length/2;
            }
            else halfIndex = charArray.length/2 + 1;
            for(int j = halfIndex; j<=charArray.length-1; j++) {
                if(charArray[j]!= charStack.pop()) {
                    return false;
                }
            }
            return true;
        }
        // Write your code here
    }

    public static void main(String[] args) {
        String palindrome = "1a2";
        ValidPalindrome vp = new ValidPalindrome();
        if(vp.isPalindrome(palindrome)) {
            System.out.println("It is palindrome!");
        }
        else
            System.out.println("It is NOT palindrome!");
    }
}
