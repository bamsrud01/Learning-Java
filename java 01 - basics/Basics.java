import java.io.Console;

public class Basics {

  public static void main(String[] args) {
    Console console = System.console();
    //  Hold a name in a variable, firstName, as a String
    String firstName = console.readLine("What is your name?  ");
    //  Insert the firstName variable into the string
    console.printf("Hello, my name is %s\n", firstName);
    console.printf("Today's date is December 28th, 2016\n");
    console.printf("I have started learning Java\n");
  }

}
