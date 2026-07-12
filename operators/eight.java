package operators;
// Write a Java program to input the length and width of a rectangle and calculate its area.
import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        int area = l*h;
        System.out.println(area);
    }
}
