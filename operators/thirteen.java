package operators;
// Write a Java program to calculate Simple Interest using the formula:
//SI = (Principal × Rate × Time) / 100

import java.util.Scanner;
public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.println(si);
    }
}
