
public class Test {
    static boolean bool;
    static byte by;
    static char ch;
    static String str;

    String chRef = new String("string");

    final static byte finalBy = 111;

    static int hexa = 0x164;

    static char a = '\u0100';

    public static void main(String[] args)
    {
        System.out.println("Bool: " + bool);
        System.out.println("Byte: " + by);
        System.out.println("Char: " + ch);
        System.out.println("String: " + str);

        System.out.println("String reference: " + str);

        System.out.println("Final integer: " + finalBy);

        System.out.println("Hex number: " + hexa);

        System.out.println("Unicode char 100: " + a);

        System.out.println("Transform: " + (byte)hexa);

        int ch1 = 'a';
        System.out.println((int)ch1);

        int age = 0; // if variable is not be initialized, it will report error
        age = age + 3;
    }
}