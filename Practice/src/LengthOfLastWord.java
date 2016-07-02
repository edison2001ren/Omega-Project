import java.util.Stack;
public class LengthOfLastWord {
    /**
     * @param s A string
     * @return the length of last word
     * Passed the testing on 07/01/2016, but the algorithm can be improved
     */
    public int lengthOfLastWord(String s) {

        if(s == null || s == "") {
            return 0;
        }
        else if(s.toCharArray().length == 1) {
            return 1;
        }
        else {
            Stack<Integer> st = new Stack<Integer>();
            char[] stringArray = s.toCharArray();
            int counter = 0;
            for(int i=0; i<stringArray.length-1; i++) {
                if(stringArray[i]==' ') {
                    continue;
                }
                else if(i == (stringArray.length - 2) && (stringArray[i+1] <= 'z' && stringArray[i+1] >= 'A')) {
                    counter += 2;
                    st.push(counter);
                }
                else {
                    ++counter;
                    if(stringArray[i+1] <= 'z' && stringArray[i+1] >= 'A') {
                        continue;
                    }
                    else {
                        st.push(counter);
                        counter=0;
                    }
                }
            }
            return st.pop();
        }
        // Write your code here
    }

    public static void main(String[] args) {

        String myString = "SSAWDFSDF SFwew";
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println("The length of last word is : " + obj.lengthOfLastWord(myString));
    }
}
