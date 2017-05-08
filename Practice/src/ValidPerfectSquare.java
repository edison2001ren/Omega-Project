/**
 * Created by sunl on 5/7/17.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        for(int i=1;i<=num;i++) {
            if(num%i==0 && num/i==i) {
                return true;
            }
            else if(num/i<i) {
                return false;
            }
        }
        return false;
    }
}
