public class Car {

    //  Encapsulation: the internal representation of object is hidden from other classes
    //  These are STATES of the class, all of which are 'private', meaning they cannot be access by other classes
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //  We will build a 'setter' method accessible from other classes.  Must be 'public'
    public void setModel(String model) {
        //  Can validate to only accept certin varieties
//        String validModel = model.toLowerCase();
//        if (validModel.equals("porsche") || validModel.equals("holden")) {
//            this.model = model;
//        } else {
//            this.model = "Unknown";
//        }
        this.model = model;     //  this.model refers to the private class variable
    }

    //  'Getter' to retrieve information from outside the class.  Is 'public'
    public String getModel() {
        return this.model;
    }

    //  CONSTRUCTOR, takes the name of the class itself
    public Car(int doors, int wheels, String model, String engine, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    //  This constructor sets default parameters in case no parameters are given
    public Car() {
        this(4, 4, "Default model", "Some engine", "Red");
    }
}
