import java.util.Scanner;

/**
 * Created by sunl on 1/31/16.
 */
public class PowerOfThree {

    public static int isPowerOfThreeRecur(int number) {

        int flag = 0;
        if (number == 0) {
            flag = 1;
        }
        else if(number%3 == 0) {
            isPowerOfThreeRecur(number/3);
        }
        else
            flag++;

        return flag;
    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Your input is: " + number);
        System.out.println();
        //System.out.println("By Loop: " + PowerOfThree.isPowerOfThree(number));
        if(PowerOfThree.isPowerOfThreeRecur(number) > 0) {
            System.out.println("By Recursive: "+ number + " is not power of 3.");
        }
        else
            System.out.println("By Recursive: "+ number + " is power of 3.");
    }
}
