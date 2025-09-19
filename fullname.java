 
package assigment3;
     import java.util.Scanner;

public class fullname {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Hello, " + fullName);
    }
}


