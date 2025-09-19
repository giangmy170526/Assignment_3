 
package assigment3;
     import java.util.Scanner;
public class input_separator {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##|\\n");
  System.out.println("Enter words separated by '##': ");
  while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

    }
}


