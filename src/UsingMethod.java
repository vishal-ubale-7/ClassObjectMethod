public class UsingMethod
{
    String color;
    int age;
    void objInit(String c ,int a)
    {
        color = c;
        age = a;
    }
    void display()
    {
        System.out.println(color+" "+age);
    }
    public static void main(String args [])
    {
        UsingMethod buzo = new UsingMethod();
        buzo.objInit("red",10);
        buzo.display();

    }

}
