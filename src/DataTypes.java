import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {

//        Primitive Data Types

        //boolean -> 1 byte
        Boolean a = false;
        Boolean b = true;
        System.out.println("a: " + a + ", b: " + b);

//        Byte Data Type ->  -128 to 127
        byte c = 10;
        byte d = -20;
        System.out.println("c: " + c + ", d: " + d);

//        Short Data Type -> -32,768 to 32,767.
        short val1 = 10000;
        short val2 = -5000;
        System.out.println("val1: " + val1 + ", val2: " + val2);

//        int Data Type -> 32-bits signed
        int num1 = 100000;
        int num2 = -200000;
        System.out.println("num1: " + num1 + ", num2: " + num2);

//        long Data Type -> 64-bits signed
        long long_num = 15000000000L;
        System.out.println("num: " + long_num);

//        float Data Type -> 32-bits
        float float_num1 = 67;
        float float_num2 = 234.5f;
        System.out.println("float_num1: " + float_num1 + ", float_num2: " + float_num2);

//        double Data Type -> 64-bits
        double double_num = 75.658d;
        System.out.println("double_num: " + double_num);

//        char Data Type -> 16-bits
        char alphabets = 'J';
        char char_a = 60, char_b = 61, char_c = 62;
        System.out.println("char_a: " + char_a + ", char_b: " + char_b + ", char_c: " + char_c);
        System.out.println("alphabets: " + alphabets);

//        Non-Primitives

//        array -> multiple values of the same type in a single variable
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("arr: " + Arrays.toString(arr));

//        String -> sequence of characters
        String s = "tpointtech";
        System.out.println("s: " + s);
        String str = new String("Austria");
        System.out.println("str: " + str);

        // other non-primitive datatypes are - class,interface,enum

    }
}
