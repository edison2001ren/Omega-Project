import java.io.*;
/**
 * Created by sunl on 7/5/16.
 */

public class SerializeDemo
{

    public static void main(String [] args)
    {
        Employee e = new Employee();
        e.name = "Rahul Patasariya";
        e.address = "4852 Cheryl Ct., Union City, CA 95051";
        e.SSN = 11122333;
        e.number = 101;

        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}