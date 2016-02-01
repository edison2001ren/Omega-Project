import java.util.Scanner;

/**
 * Created by sunl on 1/31/16.
 */
public class CalcFactorial {

    public static int calcFactorialRecur(int number) {

        if(number == 1 || number == 0) {
            return 1;
        }
        else {
            return (number * calcFactorialRecur(number-1));
        }
    }

    public static int calcFactorialLoop(int number) {

        int result = number;
        if(number == 1 || number == 0) {
            result = 1;
        }
        while(number > 1) {
            result = result * (number-1);
            number--;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Your input is: " + number);
        System.out.println("The factorial of this number is: ");
        System.out.println();
        System.out.println("By Loop: " + CalcFactorial.calcFactorialLoop(number));
        System.out.println("By Recursive: " + CalcFactorial.calcFactorialRecur(number));
    }
}
