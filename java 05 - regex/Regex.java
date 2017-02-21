import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex {
  public static void main(String[] args) {
    Console console = System.console();

    //  Code starting here

    String zipCode = console.readLine("Enter your zip code: ");
    if (zipCode.matches("^\\d{5}(-\\d{4})?$")) {
      System.out.printf("%s is a valid zip code!%n", zipCode);
    } else {
      System.out.printf("%s is not a valid zip code.%n", zipCode);
    }
  }
}
