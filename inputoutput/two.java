// Take name and age.
package inputoutput;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.print("enter your age: ");
        int age = sc.nextInt();

        System.out.println("your name is: "+ name);
        System.out.println("your age is: "+ age);

    }
}
