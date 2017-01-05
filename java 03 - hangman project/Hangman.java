public class Hangman {

  public static void main(String[] args) {

    //  Create an instance of Game object with the answer of "treehouse"
    Game game = new Game("treehouse");
    //  Create an instance of Prompter object using the game we have created
    Prompter prompter = new Prompter(game);

    boolean isHit = prompter.promptForGuess();
    if (isHit) {
      System.out.println("We got a hit!");
    } else {
      System.out.println("Not a hit.");
    }

  }
}
