/**
 * Created by sunl on 4/11/17.
 */
public class CalculateNumOfCoins {

    public int[] calcNumOfCoins(int[] coinNumber, double amt) {
        // Revised to array structure to be concise, but it would be the same using Hashtable here
        int dollarCoinAmt = coinNumber[0];
        int fiftyCentsAmt = coinNumber[1];
        int quarterCoinAmt = coinNumber[2];

        int integerAmt = ((Double)amt).intValue() / 1;
        if(integerAmt <= coinNumber[0]) {
            coinNumber[0] -= integerAmt;
            amt -= integerAmt;
        }
        else {
            amt -= coinNumber[0];
            coinNumber[0] = 0;
        }
        for(int i = 0; i <= quarterCoinAmt; i++) {
            for(int j=0; j<= fiftyCentsAmt; j++) {
                if(i * 0.25 + j * 0.5 == amt) {
                    coinNumber[1] -= j;
                    coinNumber[2] -= i;
                    return coinNumber;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        double amount = 12.25;

        int[] coinNum = {100, 175, 200};
        CalculateNumOfCoins obj = new CalculateNumOfCoins();
        int [] coinLeft = obj.calcNumOfCoins(coinNum, amount);
        if (coinLeft == null) {
            System.out.println("This amount can not be changed from vending machine!");
        }
        else {
            System.out.println("The coin left in the vending machine:");
            for (int element : coinLeft) {
                System.out.println(element);
            }
        }
    }
}
