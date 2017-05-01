/**
 * Created by sunl on 4/30/17.
 */
public class ReverseNumber {

    public int reverse(int x) {
        long reverseNum = 0;
        if( x == 0) {
            return 0;
        }
        while(x != 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        if(reverseNum > Math.pow(2, 31) || reverseNum < -(Math.pow(2, 31))) {
            return 0;
        }
        return (int)reverseNum;
    }

    public static void main(String[] args) {
        int a = 0;
        ReverseNumber obj = new ReverseNumber();
        System.out.println("The reverse of " + a + " is: " + obj.reverse(a));
    }
}
