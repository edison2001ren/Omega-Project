/**
 * Created by sunl on 4/3/17.
 */
public class Fibonacci2 {

    public int[] calcFibonacciLoop(int number) {
        int[] result_array = new int[number];
        result_array[0] = result_array[1] =  1;
        int index = 2;
        while(index < number) {
            result_array[index] = result_array[index - 1] + result_array[index - 2];
            index++;
        }
        return result_array;
    }

    public int calcFibonacciRecursive(int number) {
        if(number == 0 || number == 1) {
            return 1;
        }
        else
            return calcFibonacciRecursive(number - 1) + calcFibonacciRecursive(number - 2);
    }

    public static void main(String[] args) {
        Fibonacci2 obj = new Fibonacci2();
        int[] result = obj.calcFibonacciLoop(7);
        System.out.println("Fibonacci loop result:");
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println();
        System.out.println("Fibonacci loop result: " + obj.calcFibonacciRecursive(7));

    }
}
