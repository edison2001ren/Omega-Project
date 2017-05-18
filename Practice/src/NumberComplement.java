/**
 * Created by sunl on 5/18/17.
 */
public class NumberComplement {
    public int findComplement(int num) {
        int numberOfDigits = Integer.toBinaryString(num).length();
        int sum = 0;
        while(numberOfDigits > 0) {
            sum+=Math.pow(2, numberOfDigits-1);
            numberOfDigits--;
        }
        return num ^ Integer.valueOf(sum);
    }

    public static void main(String[] args) {
        int number = 27;
        NumberComplement obj = new NumberComplement();
        System.out.println("The complement number is: " + obj.findComplement(number));
    }
}
