/**
 * Created by sunl on 4/22/17.
 */
public class TowerOfHanoi {

    private static int step_count;

    public void moveDishes(int n, char start, char aux, char end) {

        if(n == 1) {
            System.out.println("Move 1 from " + start + " to " + end);
            step_count++;
            return;
        }
        else {
            moveDishes(n-1, start, end, aux);
            System.out.println("Move " + n + " to " + end);
            step_count++;
            moveDishes(n-1, aux, start, end);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        char startPillar = 'A';
        char auxPillar = 'B';
        char endPillar = 'C';
        TowerOfHanoi obj = new TowerOfHanoi();
        obj.moveDishes(num, startPillar, auxPillar, endPillar);
        System.out.println(step_count);
    }
}
