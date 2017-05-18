/**
 * Created by sunl on 5/18/17.
 */
public class Base7 {
    public String convertToBase7(int num) {
        String number = "";
        while(num/7!=0) {
            number = Integer.toString(Math.abs(num%7)).concat(number);
            num = num/7;
        }
        number = Integer.toString(num).concat(number);
        return number;
    }

    public static void main(String[] args) {
        int n = -8;
        Base7 obj = new Base7();
        System.out.println(n + " converts to base 7 is: " + obj.convertToBase7(n));
    }
}
