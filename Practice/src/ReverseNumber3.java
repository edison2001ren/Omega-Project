import java.util.Scanner;

/**
 * Created by sunl on 2/20/16.
 * This code handles the overflow cases and passed the testing on 4/14/2016
 */
public class ReverseNumber3 {

    public static int reverseInteger(int n) {
        long sum = 0;
        while(n!=0) {
            sum = 10 * sum + n % 10;
            n = n / 10;
        }

        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
            return 0;
        else
            return (int) sum;
    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Your input is: " + number);
        System.out.println("The reverse of this number is: " + ReverseNumber3.reverseInteger(number));
    }
}
