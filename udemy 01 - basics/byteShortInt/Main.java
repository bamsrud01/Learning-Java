public class Main {

    public static void main(String[] args) {
	//  There are many ways to represent numbers.  Bytes take the least space, but have a small range of possible values.
        //  Shorts take more space, but have a larger range.
        //  Ints seem to be the most common type, hold a wider range of possible values.

    //  Each number type has a width
        //  Byte - width of 8
        //  Short - width of 16
        //  Int - width of 32
        //  Long - width of 64

        //  This is the smallest possible value for int data type.
        int myMinvalue = -2147483648;
        //  This is the largest possible value for int data type.
        int myMaxValue = 2147483647;

        //  Byte values can range from -128 to 127
        byte myByteValue = 10;

        //  Shorts range from -32768 to 32767
        short myShortValue = 32000;

        //  Longs hold a larger value, must have 'L' or 'l' at the end
        long myLongValue = 100L;

        /*
        * THIS WILL NOT WORK
        * byte myNewByteValue = (myByteValue/2)
        * Java automatically evaluates the righthand side as an int, not a byte.
        * To resolve, you need to CAST this as a byte, like so:
        * */

        byte myNewByteValue = (byte) (myByteValue/2);



        //  Longs do not require the same amount of type casting
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("Total of myLong: " + myLong);
    }
}
