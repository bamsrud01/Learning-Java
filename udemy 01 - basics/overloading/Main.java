public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Barrett", 900);
        System.out.println("New score is " + newScore);
    }

    //  A method can be OVERLOADED by providing definitions for two identical methods
    //  If the number or type of arguments differ, Java will select the one most appropriate
    //  For example, these three methods have different numbers of arguments
    //  When called, Java will select the one that matches the number of arguments used
    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unknown player did not score any points");
        return 0;
    }
}
