// Create a triangle of characters, based on input.
// Learn about java.util.Scanner and Integer.parseInt ().
// Test your program with integers up to 26. Think why.

import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        System.out.println("Enter an integer number from 0 to 26:");
        Scanner scanner = new Scanner (System.in);
        int intN = scanner.nextInt();
        //String str = scanner.nextLine();
        //int intN = Integer.parseInt(str);
        char charN;
        charN = (char) intN;
        for (int i=0; i <= intN; i++) {

                for (int j=0; j<= i; j++) {
                    int intChar = j+97;
                    charN = (char) intChar;
                    System.out.print(charN);
                    System.out.print(' ');
                }

            System.out.print("\n");
        }

        for (int i=intN; i >= 0; i--) {
            for (int j=i; j>0; j--) {
                int intChar = i-j+97;
                charN = (char) intChar;
                System.out.print(charN);
                System.out.print(' ');
            }
            System.out.print("\n");
        }

    }
}
