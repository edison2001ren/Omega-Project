/**
 * Created by liweisun on 7/10/17.
 */
public class DiagonalDifference {

    public int calcDiagonalDiff(int lines, int[][] input) {
        int diff = 0;
        int j= 0;
        for(int i=0; i<lines; i++) {
            for(j=i; j<lines;) {
                diff += input[i][j];
                break;
            }
        }
        for(int i=lines-1; i>=0; i--) {
            for(j=lines-1-i; j<lines;) {
                diff -= input[i][j];
                break;
            }
        }
        return Math.abs(diff);
    }

    public static void main(String[] args) {
        int num_lines = 4;
        int[][] inputMatrix = new int[][]{
                {11, 2, 4, 5},
                {4, 5, 6, 6},
                {10, 8, -12, 7},
                {1, 2, 3, 12}
        };
        DiagonalDifference obj = new DiagonalDifference();
        System.out.println("The absolute difference of diagonals is: " + obj.calcDiagonalDiff(num_lines, inputMatrix));
    }
}
