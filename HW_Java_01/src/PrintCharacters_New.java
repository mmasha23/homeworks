
// Print the characters from ‘a’ to ‘z’ on the console on a single line,
// separated by a space. Use a for-loop. Note: you can directly declare
// and increment char in the for-loop. for (char c = ‘a’; …)

public class PrintCharacters_New {
    public static void main(String[] args) {
        char charN = 0;
        for (int i=65; i<91; i++) {
            charN = (char) i;
            System.out.print(charN);
            System.out.print(' ');
        }
        System.out.println();
    }
}