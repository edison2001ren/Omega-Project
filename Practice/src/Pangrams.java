/**
 * Created by sunl on 4/26/17.
 */
public class Pangrams {

    public boolean validatePangrams(String s) {

        String t = s.toLowerCase().replace(" ", "");
        int[] freq = new int[26];
        for(int i = 0; i<t.length(); i++) {
            freq[t.charAt(i) - 'a']++;
        }
        for(int num : freq) {
            if(num == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String myStr = "The quick brown fox jumps over the lazy dog";
        Pangrams obj = new Pangrams();
        if(obj.validatePangrams(myStr)) {
            System.out.println("pangram");
        }
        else
            System.out.println("not pangram");
    }
}
