public class Hangman {

  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("Usage: java Hangman <answer<");
      System.err.println("Answer is required");
      System.exit(1);
    }

    //  Create an instance of Game object with the answer of "treehouse"
    Game game = new Game(args[0]);
    //  Create an instance of Prompter object using the game we have created
    Prompter prompter = new Prompter(game);
    while (game.getRemainingTries() > 0 && !game.isWon()) {
      prompter.displayProgress();
      prompter.promptForGuess();
    }

    prompter.displayOutcome();

  }
}
