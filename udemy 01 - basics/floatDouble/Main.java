public class Main {

    public static void main(String[] args) {
	// Floats and doubles are numbers with decimal points
        //  Doubles are more precise than floats
        //  Floats track 7 decimal points of precision, while doubles track 16
    int myIntValue = 5;
    int myOtherInt = 5 / 2;  //  Will store as 2, floor division
    float myFloatValue = 5f; //  Will store as 5.0
    double myDoubleValue = 5.25d;
    System.out.println("myIntValue = " + myIntValue);
    System.out.println("myFloatValue = " + myFloatValue);
    System.out.println("myDoubleValue = " + myDoubleValue);
    //  Floats track 7 decimal points of precision, while doubles track 16
    float myCompareFloat = 5f / 3f;
    double myCompareDouble = 5d / 3d;
    System.out.println("Float's precision: " + myCompareFloat);
    System.out.println("Double's precision: " + myCompareDouble);
    //  Doubles take 8 bytes, floats take 4 bytes
    //  Doubles are faster, more precise, and most built-in functions in Java use doubles

        //  1. Create a variable to store the number of pounds
        double numPounds = 225d;
        //  2. Calculate the number of kilograms for the number and store in a variable
        //  1 pound = 0.45359237
        double convertedKilograms = numPounds * 0.45359237;
        //  3. Print the result
        System.out.println(numPounds + " pounds = " + convertedKilograms + " kilograms");
    }
}
