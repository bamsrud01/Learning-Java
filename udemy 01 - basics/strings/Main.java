public class Main {

    public static void main(String[] args) {
	    // We have learned eight primitive data types so far: byte, short, int, long, float, double, char, boolean

        // Strings are a main data type.  They are not primitive, but extremely common.  Contain any number of characters
        String myString = "This is a string.";
        System.out.println(myString);
        myString = myString + "  This is a concatenated string.";
        System.out.println(myString);
        myString += "\u00A9";
        System.out.println(myString);

        String numberString = "10";
        int myInt = 50;
        numberString += myInt;
        //  ints can be added to strings, but will concatenate rather than evaluate.  Java converts the int to a string
        System.out.println(numberString);

    }
}
