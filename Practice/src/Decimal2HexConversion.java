import java.util.Scanner;

/**
 * Created by Toda Erika on 2/3/2016.
 */
public class Decimal2HexConversion {



    public static String Decimal2HexConvert(int num) {

        final int HEX_DIVISOR = 16;
        int reminder = 0;
        String hex = "";


        while(num != 0) {
            reminder = num%HEX_DIVISOR;
            hex = HexNumberConvert(reminder) + hex;
            num = num/HEX_DIVISOR;
        }

        return hex;
    }

    public static char HexNumberConvert(int digit) {
        if(digit >= 0 && digit <= 9)
            return (char)(digit + '0');
        else
            return (char)(digit - 10 + 'A');

    }

    public static void main(String[] args) {

        System.out.println("Please enter a integer number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Decimal is: " + number);
        String finalNumber = Decimal2HexConvert(number);
        System.out.println("Hex is: " + finalNumber);
    }
}
