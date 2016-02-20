import java.util.Scanner;

/**
 * Created by sunl on 2/20/16.
 */
public class ReverseNumber3 {

    public static int reverseInteger(int n) {
        String number = "";

        while (n % 10 != 0) {
            number = number + n % 10;
            n = n / 10;
        }

        return Integer.parseInt(number);
        // Write your code here
    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Your input is: " + number);
        System.out.println("The reverse of this number is: " + ReverseNumber3.reverseInteger(number));
    }
}
