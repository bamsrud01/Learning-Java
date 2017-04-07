public class Main {

    public static void main(String[] args) {

        //  Arrays allow you to hold multiple values OF THE SAME TYPE

        //  Declare an array of integers by adding square brackets after the variable type indicator
        int[] myVariable;
        //  Create a new array of integers, and specify the length of the array.  Length cannot be changed!
        myVariable = new int[10];

        //  Can be done in a single line
        double[] myDoubleArray = new double[10];

        //  Arrays are indexed by 0.  The following accesses the sixth element
        myDoubleArray[5] = 50;
        System.out.println(myDoubleArray[5]);  //   Prints 50.0

        //  To assign multiple elements at once, but must be done when declaring
            //  Indirectly declares the length of the array based on the length of elements added
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray[2]);

        //  Can initialize an array through a for loop
            //  Use array length for limit of for loop
        int[] anotherIntArray = new int[10];
        for (int i = 0; i < anotherIntArray.length; i++) {
            anotherIntArray[i] = i * 10;
        }
        System.out.println("Confirming array through the printArray() method:");
        printArray(anotherIntArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value: " + array[i]);
        }
    }
}
