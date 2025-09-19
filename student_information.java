 
package assigment3;
 import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class student_information {
    public static void EnterAndDisplayStudentInfo() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter student full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter student birthday (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = sdf.parse(dateString);

        System.out.print("Enter student major: ");
        String major = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        float gpa = scanner.nextFloat();

        DisplayStudentInfo(id, fullName, birthday, major, gpa);
    }
    public static void DisplayStudentInfo(String id, String fullName, Date birthday, String major, float gpa) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("---- Student Info ----");
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birthday: " + sdf.format(birthday));
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
    public static void main(String[] args) throws ParseException {
        EnterAndDisplayStudentInfo();
    }
}


