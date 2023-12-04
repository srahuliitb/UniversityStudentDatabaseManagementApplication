package layer.data;

import java.util.Calendar;
import java.util.Date;

public class OrchestrateData {
    public static void main (String[] args) {
        Module module1 = new Module("CSC8204", "Advanced Programming in Java", 10);
        Module module2 = new Module("CSC8101", "Engineering for AI", 10);
//        System.out.println(module1);
//        System.out.println(module2);

        Name name1 = new Name("Rahul", "Singh");
        Name name2 = new Name("Rahul", "Singh");

//        System.out.println(name1);
//        System.out.println(name2);

        StudentID studentId1 = new StudentID("a", 1234);
        StudentID studentId2 = new StudentID("a", 1234);
//        System.out.println(studentId1);
//        System.out.println(studentId2);
//        System.out.println(studentId1.hashCode());
//        System.out.println(studentId2.hashCode());
//        System.out.println(studentId1.equals(studentId2));

        SmartCardNumber smartCardNumber1 = new SmartCardNumber("RS", 2022, 11);
        SmartCardNumber smartCardNumber2 = new SmartCardNumber("RS", 2022, 12);
//        System.out.println(smartCardNumber1);
//        System.out.println(smartCardNumber2);
//        System.out.println(smartCardNumber1.equals(smartCardNumber2));

        Date dateOfBirth1 = new Date(1990 - 1900, 1, 23); // Have to subtract 1900 from the actual year
        Date dateOfIssue1 = new Date(2023 - 1900, 11, 4); // Have to subtract 1900 from the actual year
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(dateOfIssue1);
        calendar1.add(Calendar.YEAR, 4);
        Date expiryDate1 = calendar1.getTime();
        SmartCard smartCard1 = new SmartCard(name1, dateOfBirth1, smartCardNumber1, dateOfIssue1, expiryDate1);
        System.out.println(smartCard1);
    }
}
