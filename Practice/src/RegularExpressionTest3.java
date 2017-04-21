import java.util.HashMap;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sunl on 4/21/17.
 */
public class RegularExpressionTest3 {

    //String sys_path = "SystemAdmin:7200:x1: sunl, lyao, ethans, zjq";
    String sys_path = "SysAdmin: 7200: x1: sunl, lyao, ethans, zjq";

    public void addNames() {

        String regex = "(\\s\\D+\\s*\\b)";
        Pattern pt = Pattern.compile(regex);
        Matcher mc = pt.matcher(sys_path);
        String line = "";

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        while(mc.find()) {
            line = mc.group().replace(" ", "");
        }

        for(String name : line.split(",")) {
            System.out.println(name);
            hm.put(name, 1);
        }
    }

    public static void main(String[] args) {
        RegularExpressionTest3 obj = new RegularExpressionTest3();
        obj.addNames();
    }
}
