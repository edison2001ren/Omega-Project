/**
 * Created by sunl on 5/25/17.
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 43261596;
        ReverseBits obj = new ReverseBits();
        System.out.println(input + "'s reverse bits number is: " + obj.reverseBits(input));
    }
}
