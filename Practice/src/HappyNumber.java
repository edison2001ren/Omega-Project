import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by sunl on 2/17/16.
 */
public class HappyNumber {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {

        int numSum = 0;
        int originNum = n;

        while (n/10>0) {
            numSum += (n%10)*(n%10);
            n = n/10;
        }
        numSum += n*n;

        if(numSum==1) {
            return true;
        }
        else if(numSum == originNum) {
            return false;
        }
        else
            return isHappy(numSum);
    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        HappyNumber object = new HappyNumber();

        System.out.println("Your input is: " + number);
        if (object.isHappy(number))
            System.out.println("The number is a happy number!!!");
        else
            System.out.println("The number is not a happy number!!!");
    }
}
