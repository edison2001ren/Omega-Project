/**
 * Created by Toda Erika on 3/8/2016.
 */
public class TrailingZeros {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {

        long result = calcFactorial(n);
        long counter = 0;
        while (result != 0 && result % 10 == 0) {
            counter++;
            result = result / 10;
        }

        return counter;
        // write your code here
    }

    public static long calcFactorial(long number) {
        if (number == 0) {
            return 1;
        }
        else {
            return number * calcFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        TrailingZeros obj = new TrailingZeros();
        long num = 105;
        System.out.println(TrailingZeros.calcFactorial(num));
        System.out.println(obj.trailingZeros(num));
    }
}
