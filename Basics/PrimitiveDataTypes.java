/*
    Based on: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // 8-bit signed two's complement integer. It has a minimum value of -128 and
        // a maximum value of 127 (inclusive).
        byte myByte = 0;
        // 16-bit signed two's complement integer. It has a minimum value of -32,768 and
        // a maximum value of 32,767 (inclusive).

        short myShort = 0;
        // 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1.
        int myInt = 0;

        // 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1
        long myLong = 0L;

        // 32-bit IEEE 754 floating point
        float myFloat = 0.0f;

        // 64-bit IEEE 754 floating point
        double myDouble = 0.0d;

        // The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and
        // a maximum value of '\uffff' (or 65,535 inclusive)
        // example unicode table -> https://www.ssec.wisc.edu/~tomw/java/unicode.html
        char myChar1 = 'C';
        char myChar2 = '\u0043';    // 43 hex is a 'C' in unicode
        char myChar3 = 67;          // 67 in decimal equals to 43 in hex
        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);

        // The boolean data type has only two possible values: true and false.
        boolean myBool = true;
    }
}