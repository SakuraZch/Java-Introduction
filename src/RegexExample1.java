import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cate";

    public static void main(String[] args)
    {
        String content = "I am noob " + "from runoob.com.";
        String pattern1 = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern1, content);
        System.out.println(isMatch);

        // -----

        String line = "This order was placed for QT3000! OK?";
        String pattern2 = "(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern2);
        Matcher m = r.matcher(line);
        if(m.find())
        {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        }
        else
        {
            System.out.println("NO MATCH!");
        }

        // -----

        Pattern p = Pattern.compile(REGEX);
        Matcher mp = p.matcher(INPUT);
        int count = 0;

        while(mp.find())
        {
            count++;
            System.out.println("Match number: " + count);
            System.out.println("Start: " + mp.start());
            System.out.println("End: " + mp.end());
        }

        // -----

        String REGEX1 = "foo";
        String INPUT1 = "foooooooooooooooo";
        String INPUT2 = "oooooooooofoooooooo";
        Pattern pt1 = Pattern.compile(REGEX1);
        Matcher matcher1 = pt1.matcher(INPUT1);
        Matcher matcher2 = pt1.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT1 is: " + INPUT1);
        System.out.println("Current INPUT2 is: " + INPUT2);

        System.out.println("lookingAt(): " + matcher1.lookingAt());
        System.out.println("matches(): " + matcher1.matches());
        System.out.println("lookingAt(): " + matcher2.lookingAt());
        System.out.println("matches(): " + matcher2.matches());

        // -----

        String REGEX2 = "dog";
        String INPUT3 = "The dog says meow. " + "All dogs say meow.";
        String REPLACE = "cat";
        Pattern pt2 = Pattern.compile(REGEX2);
        Matcher matcher3 = pt2.matcher(INPUT3);
        INPUT3 = matcher3.replaceAll(REPLACE);
        System.out.println(INPUT3);
    }
}