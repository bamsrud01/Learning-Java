public class Main {

    public static void main(String[] args) {
        //  Switch is a useful alternative to a bunch of if/else statements
        int switchValue = 1;

        switch(switchValue) {       //  Use the actual value/variable in parentheses
            case 1:                 //  case tests the value of the argument in parentheses
                System.out.println("Value was 1");
                break;              //  Break exists the code block
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Can test multiple conditions in one group, like this");
                break;
            default:                //  default is like 'else' in an if/else statement.  It still requires a break.
                System.out.println("Value was not 1 or 2");
                break;
        }
    }
}
