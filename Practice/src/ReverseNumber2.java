/**
 * Created by sunl on 1/29/16.
 */

public class ReverseNumber2 {

    public static void writeReverseNumRecur(int n) {

        if(n/10 == 0) {
            System.out.print(n%10);
        }
        else {
            System.out.print(n%10);
            writeReverseNumRecur(n/10);
        }
    }
}
