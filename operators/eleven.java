package operators;
// Write a Java program to input three numbers and calculate their average.
import java.util.Scanner;
public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg  = (a+b+c)/3;
        System.out.println(avg);

    }
}
