import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //  Autoboxing - Taking a primitive type and converting it into a wrapper class (int -> Integer)

        //  Unboxing - Taking the value of a wrapper class as a primitive type (Integer -> int)

        //  When compiling, Java automatically adds implied methods.  For example, typed:
            //  Integer myInt = 55;
        //  Complied:
            //  Integer myInt.valueOf(55);

        //  ArrayLists must be of wrapper types, not primitive types
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl<=10.0;dbl+=0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }   //  Autoboxing

        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }   //  Unboxing
    }
}
