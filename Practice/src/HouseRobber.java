/**
 * Created by sunl on 5/1/17.
 */
public class HouseRobber {

    public int rob(int[] num) {
        int[][] dp = new int[num.length + 1][2];
        for (int i = 1; i <= num.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = num[i - 1] + dp[i - 1][0];
        }
        return Math.max(dp[num.length][0], dp[num.length][1]);
    }

    public int rob2(int[] num) {
        int prevNo = 0;
        int prevYes = 0;
        for (int n : num) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,7,5,9,6,2};
        HouseRobber obj = new HouseRobber();
        System.out.println("The maxium we can rob is: " + obj.rob(arr));
        System.out.println("The maxium we can rob is: " + obj.rob2(arr));
    }
}
