package inputoutput;
//Input different data types together.
import java.util.Scanner;
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
        char ch = sc.next().charAt(0);
        
        double decimal = sc.nextDouble();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println(num);
        System.out.println(name);
        System.out.println(ch);
        System.out.println(decimal);

    }
}
