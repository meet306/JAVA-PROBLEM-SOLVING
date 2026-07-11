//Swap two numbers using third variable.

package variablesdatatypes;

public class three {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Before swapping:");
        System.out.println("a = " + 10);
        System.out.println("b = " + 20);
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
