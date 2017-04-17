/**
 * Created by sunl on 4/17/17.
 */
public class StudentAttendanceRecord {

    public boolean checkRecord(String s) {
        int record_a = 0;
        int record_l = 0;
        for(char ch: s.toCharArray()) {
            if (ch == 'P') {
                record_l = 0;
            } else if (ch == 'A') {
                record_a++;
                record_l = 0;
                if(record_a > 1) {
                    return false;
                }
            }
            else {
                record_l++;
                if(record_l > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRecord2(String s) {
        return !s.matches(".*A.*A.*") && !s.matches(".*LLL.*");
    }

    public static void main(String[] args) {

        StudentAttendanceRecord obj = new StudentAttendanceRecord();
        String studentRecord = "PPALLL";
        System.out.println("The reverse of this string is: " + obj.checkRecord(studentRecord));
        System.out.println("The reverse of this string is: " + obj.checkRecord2(studentRecord));
    }
}
