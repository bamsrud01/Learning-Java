//  Use Scanner to take user input
import java.util.Scanner;

class Prompter {

  //  Create instance of Game object
  private Game game;

  //  constructor for Prompter objects
  public Prompter(Game game) {
    this.game = game;
  }

  //  Handle user input for guesses
  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
    boolean isHit = false;
    boolean isAcceptable = false;

    do {
      System.out.print("Enter a letter:  ");
      String guessInput = scanner.nextLine();
      try {
        //  Determine if character at index 0 is in the Hangman word
        isHit = game.applyGuess(guessInput);
        isAcceptable = true;
      } catch(IllegalArgumentException iae) {
        System.out.printf("%s.  Please try again. %n", iae.getMessage());
      }
    } while (! isAcceptable);

    return isHit;
  }

  //  Display progress to user
  public void displayProgress() {
    System.out.printf("You have %d remaining guesses:  %s %n",
                      game.getRemainingTries(),
                      game.getCurrentProgress());
  }

}
