/**
 * Created by Toda Erika on 3/19/2016.
 */
public class ReplaceBlank {

    public int replaceBlank(char[] string, int length) {
        String finalString = "";
        String subString;
        String endString;
        String space = "%20";
        int startingIndex = 0;
        for(int i=0; i<length; i++) {
            if(string[i]==' ') {
                subString = new String(string, startingIndex, i-startingIndex);
                finalString = finalString + subString + space;
                startingIndex = i+1;
            }
            else if(i==length-1){
                endString = new String(string, startingIndex, i-startingIndex+1);
                finalString += endString;
            }
        }
        System.out.println(finalString);
        return finalString.length();
        // Write your code here
    }

    public static void main(String[] args) {
        ReplaceBlank rb = new ReplaceBlank();
        String string = "hello world";
        char[] stringArray = string.toCharArray();
        int trueLength = stringArray.length;
        System.out.println(string);
        System.out.println(rb.replaceBlank(stringArray, trueLength));
    }
}
