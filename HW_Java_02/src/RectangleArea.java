import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("enter side a:");
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();

        System.out.println("enter side b:");
        Scanner scanner2 = new Scanner (System.in);
        int b = scanner2.nextInt();

        System.out.println("the area is" + ": " + a*b);



    }
}
