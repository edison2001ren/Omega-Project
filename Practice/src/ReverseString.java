import java.util.Scanner;

/**
 * Created by sunl on 1/31/16.
 */
public class ReverseString {

    public String writeReverseStringRecursive(String s) {


        return null;
    }

    public String writeReverseStringLoop(String s) {

        char[] charStr = s.toCharArray();
        StringBuilder resultStr = new StringBuilder();
        for(int index = charStr.length-1; index >= 0; index--) {
            resultStr.append(charStr[index]);
        }
        return resultStr.toString();
    }

    public static void main(String[] args) {

        System.out.println("Please enter a string: ");
        Scanner scanner = new Scanner(System.in);

        String myString = scanner.next();

        ReverseString obj = new ReverseString();

        System.out.println("Your input is: " + myString);
        System.out.println("By loop: \n");
        obj.writeReverseStringLoop(myString);
        System.out.println(obj.writeReverseStringLoop(myString));
        System.out.println("\nBy Recursive: ");
        System.out.println(obj.writeReverseStringRecursive(myString));
    }
}
