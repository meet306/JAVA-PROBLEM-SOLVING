package operators;
//  Write a Java program to input the radius of a circle and calculate its area.
import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
