import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by sunl on 4/13/16.
 * /**
 * @param A : A string includes Upper Case letters
 * @param B : A string includes Upper Case letter
 * @return :  if string A contains all of the characters in B return true else return false
 */

public class CompareStrings {

    public boolean compareStrings(String A, String B) {

        if(A == null && B == null || (A == "" && B != "")) {
            return false;
        }
        else if((B == "" && A != "") || B == "" && A == "") {
            return true;
        }
        char[] aStr = A.toCharArray();
        char[] bStr = B.toCharArray();
        Stack<Character> bStack = new Stack<Character>();
        for(int i=0; i<bStr.length; i++) {
            bStack.push(bStr[i]);
        }
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        for(int j=0; j<aStr.length;j++) {
            ht.put(aStr[j], j);
        }
        char top = bStack.pop();
        while(!bStack.isEmpty()) {
            if(ht.containsKey(top)) {
                top = bStack.pop();
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String aString = "ABCDEFG";
        String bString = "ACC";

        CompareStrings cs = new CompareStrings();
        if(cs.compareStrings(aString, bString)) {
            System.out.println(aString + " contains all letters in " + bString);
        }
        else
            System.out.println(aString + " does not contain all letters in " + bString);
    }
}
