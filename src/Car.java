
// 2020/4/15 //

class Vehicle {}

public class Car extends Vehicle
{
    public static void PrintArr(int[] arr)
    {
        for(int it : arr)
        {
            System.out.println( it);
        }
        System.out.println();
    }
    public static void PrintArr(double[] arr)
    {
        for(double it : arr)
        {
            System.out.println(it);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        boolean result = car instanceof Car;
        System.out.println(result);

        // int x = 0;
        // while(x < 10) 
        // {
        //     x++;
        //     System.out.println(x);
        // }

        // int y = 0;
        // do
        // {
        //     y++;
        //     System.out.println(y);
        // }while(y < 10);

        // int[] nums = {10, 2, 3, 4, 5, 6};
        // for(int num : nums)
        // {
        //     System.out.println(num);
        // }

        Integer intNum = 10;
        intNum = intNum + 100;
        System.out.println(intNum);
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(intNum.doubleValue());

        int comp = 1100;
        if(intNum.compareTo(comp) == 0)
        {
            System.out.println("Equal");
        }
        else if(intNum.compareTo(comp) == 1)
        {
            System.out.println("Comp smaller");
        }
        else
        {
            System.out.println("Comp bigger");
        }

        Character ch = 'a';
        System.out.println(ch);
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isWhitespace(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));

        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.toString(ch));

        String greeting = new String("Cailiaojiaocheng");
        System.out.println(greeting);

        char[] chArr = {'a', 'b', 'c', 'd', 'e'};
        String chStr = new String(chArr);
        System.out.println(chStr);
        System.out.println(chStr.length());
        System.out.printf("%d%.2f%s\n", 1, 1.2, chStr);
        chStr = String.format("%d%.2f%s", 200, 1.4, chStr);
        System.out.println(chStr);

        StringBuffer sBuf = new StringBuffer("Net: ");
        sBuf.append("www.");
        sBuf.append("runoob.");
        sBuf.append("com");
        sBuf.reverse();
        System.out.println(sBuf);
        String sBufStr = sBuf.toString();
        System.out.println(sBufStr);

        double[] doubleArr = {1.2, 1.3, 1.4};
        int intArr[] = {1, 2, 3, 4};
        for(double db : doubleArr)
        {
            System.out.println(db);
        }
        for(int it : intArr)
        {
            System.out.println(it);
        }

        int[] arr = new int[10];
        for(int it : arr)
        {
            System.out.println(it);
        }

        PrintArr(new double[]{1.2, 1.3, 1.4});
        PrintArr(new int[]{1, 1, 4});
    }
}