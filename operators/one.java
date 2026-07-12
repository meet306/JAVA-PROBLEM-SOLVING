package operators;
// Write a Java program to input two numbers and print their addition.
import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();

        System.out.print("enter a second number:");
        int b = sc.nextInt();

        int c = a+b;
        System.out.print("your answer is: "+ c);

    }
}
