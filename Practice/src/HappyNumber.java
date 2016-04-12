import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by sunl on 2/17/16.
 * Modified on 4/11/16.
 * Solution passed!!!
 */
public class HappyNumber {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {

        int i = 0;
        int newSum;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        newSum = calcSquare(n);
        while (!ht.containsKey(newSum))
            if (newSum == 1) {
                return true;
            } else {
                ht.put(newSum, i);
                i++;
                newSum = calcSquare(newSum);
            }
        return false;
    }

    public int calcSquare(int number) {
        int sum = 0;
        while(number!=0) {
            sum += Math.pow(number%10, 2);
            number=number/10;
        }
        return sum;
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
