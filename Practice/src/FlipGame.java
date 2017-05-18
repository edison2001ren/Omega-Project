import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by sunl on 5/17/17.
 */
public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        ArrayList<String> myList = new ArrayList<String>();
        String t = "";
        for(int i=0; i<s.length(); i++) {
            if(i+2 == s.length() && (s.charAt(i) == '+' && s.charAt(i+1) == '+')) {
                t = s.substring(0,i).concat("--");
                myList.add(t);
                break;
            }
            else if(i+1<s.length() && (s.charAt(i) == '+' && s.charAt(i+1) == '+')) {
                t = s.substring(0,i).concat("--").concat(s.substring(i+2));
                myList.add(t);
            }
        }
        return myList;
    }

    public static void main(String[] args) {
        String s = "+++---++--";
        FlipGame obj = new FlipGame();
        Iterator<String> it = obj.generatePossibleNextMoves(s).iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
