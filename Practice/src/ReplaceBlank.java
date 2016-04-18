/**
 * Created by Toda Erika on 3/19/2016.
 */
public class ReplaceBlank {

    public int replaceBlank(char[] string, int length) {
        if (string == null || length == 0) {
            return 0;
        }
        int result = length;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                result += 2;
            }
        }
        int index = result - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[index] = '0';
                string[index - 1] = '2';
                string[index - 2] = '%';
                index -= 3;
            } else {
                string[index] = string[i];
                index--;
            }
        }
        return result;
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
