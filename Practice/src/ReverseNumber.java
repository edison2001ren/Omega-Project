/**
 * Created by sunl on 1/29/16.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReverseNumber {

    public static void writeReverseNum(int n) {
        List numberList = new ArrayList();
        while(n/10 != 0) {
            int digit = n%10;
            numberList.add(digit);
            n = n/10;
        }

        if(n/10 == 0) {
            numberList.add(n%10);
        }

        Iterator iterator = numberList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Your input is: " + number);
        System.out.println("The reverse of this number is: ");
        System.out.println("By loop: ");
        ReverseNumber.writeReverseNum(number);
        System.out.println();
        System.out.println("By Recursive: ");
        ReverseNumber2.writeReverseNumRecur(number);
    }
}
