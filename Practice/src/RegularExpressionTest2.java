/**
 * Created by sunl on 4/24/17.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class RegularExpressionTest2 {
    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("123-45-6789");
        input.add("9876-5-4321");
        input.add("987-65-4321 (attack)");
        input.add("987-65-4321 ");
        input.add("192-83-7465");
        input.add("406600801");


        for (String ssn : input) {
            if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
                System.out.println("Found good SSN: " + ssn);
            }
        }

        String mask_input =
                "User clientId=23421. Some more text clientId=33432. This clientNum=100";

        // Group pattern matching
        Pattern p = Pattern.compile("(clientId=)(\\d+)");
        Matcher m = p.matcher(mask_input);

        StringBuffer result = new StringBuffer();
        while (m.find()) {
            System.out.println("Masking: " + m.group(2));
            m.appendReplacement(result, m.group(1) + "***masked***");
        }
        m.appendTail(result);
        System.out.println(result);
    }


}
