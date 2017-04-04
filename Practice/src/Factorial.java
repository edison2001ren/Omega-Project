/**
 * Created by sunl on 4/3/17.
 */
public class Factorial {

    public int calcFactorialLoop(int number) {

        int factorial = 1;
        if (number == 0 || number == 1) {
            return 1;
        }
        else {
            while(number > 1) {
                factorial *= number;
                number--;
            }
            return factorial;
        }
    }

    public int calcFactorialRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        else
            return number * calcFactorialRecursive(number - 1);
    }

    public static void main(String[] args ) {
        Factorial obj = new Factorial();
        int loop_result = obj.calcFactorialLoop(4);
        System.out.println("Loop result: " + loop_result);
        int recursive_result = obj.calcFactorialRecursive(4);
        System.out.println("Recursive result: " + recursive_result);
    }
}