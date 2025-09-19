 
package assigment3;
     import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double second = scanner.nextDouble();

        double average = (first + second) / 2;
        System.out.println("The average is: " + average);
    }
}


