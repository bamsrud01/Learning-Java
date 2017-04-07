public class Main {

    public static void main(String[] args) {

        //  For loop structure is initial, termination, increment
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        //  While loop runs while condition is true
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //  A do/while loop always executes at least once
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
