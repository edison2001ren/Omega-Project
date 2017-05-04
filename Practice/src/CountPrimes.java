/**
 * Created by sunl on 5/4/17.
 */
public class CountPrimes {

    public int countPrimes(int n) {

        boolean[] notPrime = new boolean[n];
        int count = 0;
        for(int i = 2; i<n; i++) {
            if(notPrime[i] == false) {
                count++;
            }
            for(int j=2; i*j<n;j++) {
                notPrime[i*j] = true;
            }
        }
        return count;
    }

    public static void main(String[] arg) {
        int num = 10000;
        CountPrimes obj = new CountPrimes();
        System.out.println(num + " has " + obj.countPrimes(num) + " primes!");
    }
}
