import java.util.regex.Pattern;

/**
 * Created by sunl on 4/24/17.
 */
public class CalculateString {

    public int calcString(String s) {
        int sum = 0;
        int sign = 1;
        if(s == "" || s == null) {
            return -9999999;
        }
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += Character.getNumericValue(s.charAt(i)) * sign;
            }
            else if(s.charAt(i) == '+') {
                sign = 1;
            }
            else if(s.charAt(i) == '-') {
                sign = -1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String myStr = "-2+4-7-2+9+1-0";
        CalculateString obj = new CalculateString();
        System.out.println(myStr);
        System.out.println(obj.calcString(myStr));
    }
}
