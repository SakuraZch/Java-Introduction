
// 2020/4/16 //

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Dt
{
    public static void main(String[] args)
    {
        Date dt1 = new Date();
        System.out.println(dt1);
        Date dt2 = new Date(1000000000);
        System.out.println(dt2);

        System.out.println(dt1.after(dt2));
        System.out.println(dt2.before(dt1));
        System.out.println(dt1.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS E D F z");
        System.out.println("Now: " + ft.format(dt1));

        // 初始化 Date 对象
        Date date = new Date();
 
        //c的使用  
        System.out.printf("全部日期和时间信息：%tc%n",date);          
        //f的使用  
        System.out.printf("年-月-日格式：%tF%n",date);  
        //d的使用  
        System.out.printf("月/日/年格式：%tD%n",date);  
        //r的使用  
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
        //t的使用  
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
        //R的使用  
        System.out.printf("HH:MM格式（24时制）：%tR%n",date);

        System.out.printf("%1$s %2$tB %2$td %2$tY", "Due date: ", date);

        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "2020-04-17" : args[0];
        System.out.print(input + " Parses as ");
        Date t1;
        try 
        {
            t1 = ft1.parse(input);
            System.out.println(t1);
        }
        catch(ParseException e1)
        {
            System.out.println("Unparseable using " + ft1);
        }

        try
        {
            Thread.sleep(1000);
            System.out.println("Sleep test");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    
        // Calender
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 8 - 2, 19);
        c1.set(Calendar.YEAR, 2011);
        System.out.println(Calendar.YEAR);

    }
}