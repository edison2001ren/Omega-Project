import java.util.Scanner;

/**
 * Created by sunl on 1/31/16.
 */
public class ReverseString {

    public static void writeReverseStringRecur(String newString) {


    }

    public static void main(String[] args) {

        System.out.println("Please enter a string: ");
        Scanner scanner = new Scanner(System.in);

        String myString = scanner.next();

        System.out.println("Your input is: " + myString);
        System.out.println("The reverse of this number is: ");
        System.out.println("By loop: ");
        //ReverseString.writeReverseString(myString);
        System.out.println();
        System.out.println("By Recursive: ");
        ReverseString.writeReverseStringRecur(myString);
    }
}
