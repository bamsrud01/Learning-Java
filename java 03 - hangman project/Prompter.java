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
    System.out.print("Enter a letter:  ");
    String guessInput = scanner.nextLine();
    //  Take only the character at index 0
    char guess = guessInput.charAt(0);
    //  Determine if character at index 0 is in the Hangman word
    return game.applyGuess(guess);
  }

  //  Display progress to user
  public void displayProgress() {
    System.out.printf("What's the word???   %s %n", game.getCurrentProgress());
  }

}
