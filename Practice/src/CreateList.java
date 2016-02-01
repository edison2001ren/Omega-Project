/**
 * Created by sunl on 1/29/16.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CreateList {

    public static void main(String[] arg){
        List myList = new ArrayList();
        myList.add("a");
        myList.add("b");
        myList.add("c");

        String element0 = (String) myList.get(0);
        String element1 = (String) myList.get(1);
        String element2 = (String) myList.get(2);

        System.out.println(element0 + element1 + element2);

        //for-loop
        for(Object object: myList) {
            String element = (String) object;
            System.out.print(element);
        }

        System.out.println();

        //Iterator
        Iterator iterator = myList.iterator();
        while(iterator.hasNext()) {
            String element = (String) iterator.next();
                    System.out.print(element);
        }

        int size = myList.size();
        System.out.println("\n" + size);

    }
}
