//  First, import our package and Date
import java.util.Date;
import com.teamtreehouse.Treet;

public class Example {

  public static void main(String[] args) {
    Treet treet = new Treet(
      "Barrett",
      "This is my Treet: A Treehouse Tweet",
      new Date(1421849732000L)  //  The L indicates the integer is long
    );
    System.out.printf("This is a new treet: %s %n", treet);
    System.out.println("The words are:");
    for (String word: treet.getWords()) {
      System.out.println(word);
    }
  }

}
