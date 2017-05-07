import java.util.HashSet;
import java.util.Set;

/**
 * Created by sunl on 5/6/17.
 */
public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        s = s.replaceAll("[^A-z]", "").toLowerCase();
        int[] freq = new int[26];
        int odd_num = 0;

        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int j=0; j<26; j++) {
            if(freq[j]%2 != 0 && odd_num>1) {
                return false;
            }
            else if(freq[j]%2 != 0) {
                odd_num++;
            }
            else
                continue;
        }
        return true;
    }

    public boolean canPermutePalindrome2(String s) {
        Set<Character> set=new HashSet<Character>();
        for(int i=0; i<s.length(); ++i){
            if (!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else
                set.remove(s.charAt(i));
        }
        return set.size()==0 || set.size()==1;
    }

    public static void main(String[] args) {
        String myString = "AaBb//a";
        PalindromePermutation obj = new PalindromePermutation();
        System.out.println("Can this string be palindrome? " + obj.canPermutePalindrome(myString));
        System.out.println("Can this string be palindrome? " + obj.canPermutePalindrome2(myString));
    }
}
