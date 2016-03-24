
// Find suitable types for variables. You are given the following types:
// byte, short, int, long, char, boolean, float, double, and String.
// Assign the following values to them
// false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011,
// 0.5f, 919827112351L, 127, ‘c’.
// Try to assign 32768 to short and see what happens
public class AssignVariables {
    public static void main(String[] args) {
        boolean booleanN = false;
        String stringN = "Palo Alto, CA";
        short shortN = 32767;
        //short shortN2 = 32768; Comment: incompatible types, required: short; found: int;
        int intN = 2000000000;
        double doubleN = 0.1234567891011;
        float floatN = 0.5f;
        long longN = 919827112351L;
        byte byteN = 127;
        char charN = 'c';
    }
}
