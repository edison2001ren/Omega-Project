/**
 * Created by sunl on 4/16/17.
 */
public class ExcelColumnNumber {

    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String [] args) {
        String column = "ABZ";
        ExcelColumnNumber obj = new ExcelColumnNumber();

        System.out.println(column + " is mapped to the number: " + obj.titleToNumber(column));
    }
}
