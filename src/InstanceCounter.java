
// 2020/4/14 //

public class InstanceCounter {
    private static int numInstances = 0;

    private final static int value = 10;

    protected static int getCount() {
       return numInstances;
    }
  
    private static void addInstance() {
       numInstances++;
    }
  
    InstanceCounter() {
       InstanceCounter.addInstance();
    }
  
    public static void main(String[] arguments) {
       System.out.println("Starting with " +
       InstanceCounter.getCount() + " instances");
       for (int i = 0; i < 500; ++i){
          new InstanceCounter();
           }
       System.out.println("Created " +
       InstanceCounter.getCount() + " instances");

        
        System.out.println(value);

    }
 }
 