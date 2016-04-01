/**
 * Created by sunl on 3/23/16.
 */
public class FindMajNumber2 {

    public static int findMajNumber(int[] array){
        if(array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maj = array[0];
        int count = 1;
        for(int i=1; i<array.length; i++) {
            if(array[i]== maj) {
                count++;
            }
            else {
                count--;
            }
            if(count == 0) {
                maj = array[i];
                count = 1;
            }
        }
        return maj;
    }

    public static boolean verifyMajNumber(int[] array, int maj){
        int counter = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == maj) {
                counter++;
            }
        }
        if(counter > (array.length) / 2) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        int[] numList = {};
        int majorNumber = findMajNumber(numList);
        if(verifyMajNumber(numList, majorNumber)) {
            System.out.println("The majority number is: " + majorNumber);
        }
        else {
            System.out.println("This array does not have a majority number!");
        }
    }
}
