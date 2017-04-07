public class Main {

    public static void main(String[] args) {
	    // Operators return a result from interaction with data types.  Doing math!
        //  Assignment: =
        int result = 1;
        //  Basic math: + - * /
        result = result + 2;
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        //  Modulo, finding the remainder: %
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        //  Shortcuts: += -= *= /= ++ --

        //  CONDITIONAL OPERATORS
        // == !=
        // < > <= >=
        // && || !
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        int topScore = 99;
        if (topScore != 100)
            System.out.println("You didn't get the high score!");

        //  Good to enclose comparisons to make it less ambiguous
        //  Be aware of operator precedence:


        //  Ternary operator:
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;

        //  CHALLENGE

        //  1.  Set starting values
        double firstValue = 20d;
        double secondValue = 80d;
        //  2.  Find the remainder of the outcome
        double outcome = (firstValue + secondValue) * 50;
        double remainder = outcome % 40;
        //  3.  Determine if it is over the limit or not
        double limit = 20;
        if (remainder >= limit)
            System.out.println("Total was over the limit!");
    }
}
