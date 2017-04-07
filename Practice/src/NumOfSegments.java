import java.util.Stack;

/**
 * Created by sunl on 4/7/17.
 */
public class NumOfSegments {

    public int countSegments(String s) {

        char[] charArray = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        int num_of_seg = 0;
        int length_of_ch = 0;

        for(char ch : charArray) {
            if(ch ==' '&& length_of_ch != 0) {
                st.clear();
                num_of_seg++;
                length_of_ch = 0;
            }
            else if(ch != ' ') {
                st.push(ch);
                length_of_ch++;
            }
        }
        if (!st.empty()) {
            num_of_seg++;
        }
        return num_of_seg;
    }

    public int countSegmentsAnswer(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            // Looking for a pattern, first character after a space
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
                res++;
        return res;
    }

    public static void main(String[] args) {
        String s = "Of all the gin joints in all the towns in all the world,   ";
        NumOfSegments obj = new NumOfSegments();
        System.out.println("There are " + obj.countSegments(s) + " segments!");
        System.out.println("There are " + obj.countSegmentsAnswer(s) + " segments!");
    }
}
