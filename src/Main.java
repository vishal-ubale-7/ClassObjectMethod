//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main // create class
{
    public void eat() // create method eat()
    {
        System.out.println("I am Eating");

    }
    public void run() // create method run()
    {
        System.out.println("I am Running");
    }
    public static void main(String[] args) // main method
    {
      Main buzo = new Main(); // create object
      buzo.eat();   // call eat method use.operator
      buzo.run();   // call the run method
    }
}

