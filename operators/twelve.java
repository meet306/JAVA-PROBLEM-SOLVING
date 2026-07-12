package operators;
// Write a Java program to input the marks obtained and total marks, then calculate the percentage.
import java.util.Scanner;
public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        
        int totalMarks = math + science + english;
        double percentage = (totalMarks/300.0)*100;
        System.out.println(percentage);

    }
}
