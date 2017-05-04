/**
 * Created by sunl on 5/3/17.
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if(n==1) {
            return 1;
        }
        else if(n==2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        for(int i=2; i<n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        return second;
    }

    public static void main(String args[]) {
        int number = 6;
        ClimbStairs obj = new ClimbStairs();
        System.out.println("There are " + obj.climbStairs(number) + " ways to reach to top!!");
    }
}
