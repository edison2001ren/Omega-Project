/**
 * Created by sunl on 5/17/17.
 */
public class AddDigits {
    public int addDigits(int num) {
        while(num/10 > 0) {
            int sum = 0;
            while(num/10 > 0) {
                sum+=num%10;
                num = num / 10;
            }
            sum+=num;
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int number = 1231;
        AddDigits obj = new AddDigits();
        System.out.println("The result is: " + obj.addDigits(number));
    }
}
