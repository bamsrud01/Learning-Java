public class Main {

    public static void main(String[] args) {
	// Char data stores a single letter or character.  Cannot contain more
        //  Width of 16: 2 bytes
        char myChar = '&';
        //  Char CAN contain unicode characters, which are assigned with more than one character, but output only one
        char myUnicodeCopyright = '\u00A9';
        System.out.println("Unicode output: " + myUnicodeCopyright);
    //  Boolean is true or false
        boolean myBoolean = true;

        //  1. Find the code for the registered symbol in a unicode chart
        //  Unicode value: 00AE
        //  2. Create a char variable and assign it to the unicode value of the symbol
        char registered = '\u00AE';
        //  3. Display the value
        System.out.println("Registered symbol: " + registered);
    }
}
