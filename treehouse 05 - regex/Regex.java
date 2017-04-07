import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex {
  public static void main(String[] args) {
    Console console = System.console();

    //  Code starting here

    String zipCode = "55414";
    if (zipCode.matches("^\\d{5}(-\\d{4})?$")) {
      System.out.printf("%s is a valid zip code!%n", zipCode);
    } else {
      System.out.printf("%s is not a valid zip code.%n", zipCode);
    }

    String skills = "JavaScript, HTML, CSS, and Java";
    for (String skill : skills.split("\\W+(and\\W+)?")) {
      System.out.printf("Skill: %s %n", skill);
    }
    String script = "Surely capturing shushes shall show how beneficial Regular Expressions actually are";
    //  Use Pattern
    Pattern pattern = Pattern.compile("(\\w*(sh|ti|su|ci|tu|si)\\w*)", Pattern.CASE_INSENSITIVE);
    //  User Matcher
    Matcher matcher = pattern.matcher(script);
    while (matcher.find()) {
      System.out.printf("%s is a shushy word because of %s %n",
        matcher.group(1),
        matcher.group(2));
        //  The parantheses around the regex on line 24 indicate how far matcher.group() must go
    }
  }
}
