package operators;
// Write a Java program to calculate Compound Interest.
import java.util.Scanner;
public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();   
        int t = sc.nextInt();
        double amount  = p * Math.pow((1+r/100.0),t);
        System.out.println(amount);
        double ci = amount - p;
        System.out.println(ci);
    }
}
