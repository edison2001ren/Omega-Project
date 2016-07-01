import java.util.Stack;
public class LengthOfLastWord {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {

        if(s == null || s == "") {
            return 0;
        }
        else {
            Stack<Integer> st = new Stack<Integer>();
            char[] stringArray = s.toCharArray();
            int counter = 0;
            for(int i=0; i<stringArray.length-1; i++) {
                if(stringArray[i]==' ') {
                    continue;
                }
                else {
                    ++counter;
                    if(stringArray[i+1] <= 'z' && stringArray[i+1] >= 'a') {
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

        String myString = "hello my lord";
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println("The length of last word is : " + obj.lengthOfLastWord(myString));
    }
}
