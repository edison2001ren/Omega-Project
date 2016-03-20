
public class SquareX {

    private static int sqrt(int x) {

        int num=0;
        if(x==1) {
            num = 1;
        }
        for(int i=1; i<x; i++) {
            if(x/i == i) {
                num = i;
                break;
            }
            else if(x/i < i) {
                num = i-1;
                break;
            }
        }
        return num;
        // write your code here
    }

    public static void main(String[] args) {
        System.out.println(SquareX.sqrt(1));
    }
}
