/**
 * Created by Toda Erika on 7/2/2016.
 */
public class Fibonacci {

    public int fibonacci(int n) {

        if (n <= 1) {
            return 0;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i < n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        return second;
        // write your code here
    }

    public static void main(String args[]) {
        int number = 47;
        Fibonacci obj = new Fibonacci();
        System.out.println("The Fibonacci number is: " + obj.fibonacci(number));
    }
}
