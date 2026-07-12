package operators;
// Write a Java program to input two numbers and print the remainder using the modulus (%) operator.
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a%b;
        System.out.println(c);
    }
}
