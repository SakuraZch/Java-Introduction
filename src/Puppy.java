
public class Puppy {
    int puppyAge;

    public Puppy() {}
    public Puppy(String name) 
    {
        System.out.println("Fuck Java!");
        System.out.println("The name of puppy: " + name);
    }
    public void SetAge(int age)
    {
        puppyAge = age;
    }
    public int getAge()
    {
        System.out.println("The age of puppy: " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args)
    {
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.SetAge(10);
        System.out.println("The age returned: " + myPuppy.getAge());
        System.out.println(myPuppy);
    }
}