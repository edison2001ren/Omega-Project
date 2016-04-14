import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by sunl on 4/5/16.
 */
public class HashTableDemo {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("Key1", "Julie");
        ht.put("Key2", "Lily");
        ht.put("Key3", "Edi");
        ht.put("Key4", "Ethan");
        ht.put("Key5", "Alexa");
        ht.put("Key2", "Amy");


        names = ht.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println(key + " : " + ht.get(key));
        }
    }
}
