/**
 * Created by sunl on 7/5/16.
 */
public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
