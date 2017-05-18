/**
 * Created by sunl on 5/18/17.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(Integer.bitCount(num) > 1 || num == 0) {
            return false;
        }
        else if(((Integer.toBinaryString(num).length()-1) % 2) != 0) {
            return false;
        }
        else
            return true;
    }

    public static void main(String[] args) {
        int number = 32;
        PowerOfFour obj = new PowerOfFour();
        System.out.println(obj.isPowerOfFour(number));
    }
}
