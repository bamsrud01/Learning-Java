class Game {
  //  Declare variables
  private String answer;
  private String hits;
  private String misses;

  //  Constructor for Game objects
  public Game(String answer) {
    this.answer = answer;
    hits = "";
    misses = "";
  }

  //  method to determine if guess is in answer, and assign to hits or misses
  public boolean applyGuess(char letter) {
    boolean isHit = answer.indexOf(letter) != -1;
    if (isHit) {
      hits += letter;
    } else {
      misses += letter;
    }
    return isHit;
  }

  //
  public String getCurrentProgress() {
    String progress = "";
    for (char letter : answer.toCharArray()) {
      char display = '-';
      if (hits.indexOf(letter) != -1) {
        display = letter;
      }
      progress += display;
    }
    return progress;
  }

}
