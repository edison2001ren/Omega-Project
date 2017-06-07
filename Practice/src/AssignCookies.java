import java.util.Arrays;
/**
 * Created by sunl on 5/23/17.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int returnVal = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0; i<g.length;i++) {
            for(int j = returnVal; j<s.length; j++) {
                if(s[j]>= g[i]) {
                    returnVal++;
                    break;
                }
            }
        }
        return returnVal;
    }

    public int findContentChildrenSolution(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++) {
            if(g[i]<=s[j]) i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] kids = {1,2,3};
        int[] cookies = {1,2};
        AssignCookies obj = new AssignCookies();
        System.out.println(obj.findContentChildren(kids, cookies) + " cookie will be given out!");
        System.out.println(obj.findContentChildrenSolution(kids, cookies) + " cookie will be given out!");
    }
}
