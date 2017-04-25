import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

/**
 * Created by sunl on 4/21/17.
 */
public class AddNamesFromFile {

    //String sys_path = "SystemAdmin:7200:x1: sunl, lyao, ethans, zjq";
    String sys_path = "SysAdmin: 7200: x1: sunl, lyao, ethans, zjq";

    public void addNames() {

        String regex = "\\s[\\w,\\s]+$";
        Pattern pt = Pattern.compile(regex);
        Matcher mc = pt.matcher(sys_path);
        String line = "";

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        while(mc.find()) {
            line = mc.group().trim().replace(", ", ",");
        }

        for(String name : line.split(",")) {
            hm.put(name, 1);
        }
        for(String name: readFile()) {
            if(hm.containsKey(name) || name == null) {
                continue;
            }
            else
                hm.put(name, 1);
        }
        writeFile(hm);
    }

    public void writeFile(HashMap nameList) {
        String fileName = "/Users/sunl/Projects/Java/Omega-Project/Practice/src/NameAdded.txt";
        Set set = nameList.entrySet();
        try {
            // Assume default encoding.
            FileWriter fw = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bw = new BufferedWriter(fw);

            // Note that write() does not automatically
            // append a newline character.
            Iterator i = set.iterator();
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                bw.write(me.getKey().toString() + "\n");
            }
            // Always close files.
            bw.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    public String[] readFile() {
        String fileName = "/Users/sunl/Projects/Java/Omega-Project/Practice/src/NameToAdd.txt";
        String line = "";
        String[] names = new String[20];
        try {
            // FileReader reads text files in the default encoding.
            FileReader fr = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader br = new BufferedReader(fr);

            int i = 0;
            while((line = br.readLine()) != null) {
                names[i] = line;
                i++;
            }
            // Always close files.
            br.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        return names;
    }

    public static void main(String[] args) {
        AddNamesFromFile obj = new AddNamesFromFile();
        obj.addNames();
    }
}
