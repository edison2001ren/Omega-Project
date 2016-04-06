import java.util.LinkedList;

/**
 * Created by sunl on 4/5/16.
 */
public class LinkedListDemo {

    public static void main(String args[]) {

         /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();

         /*add(String Element) is used for adding
          * the elements to the linked list*/
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

         /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedList);
    }
}
