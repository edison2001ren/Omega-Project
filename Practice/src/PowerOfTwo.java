/**
 * Created by sunl on 5/18/17.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return Integer.bitCount(n) == 1 && n != Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int number = -2147483648;
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(number));
    }
}
