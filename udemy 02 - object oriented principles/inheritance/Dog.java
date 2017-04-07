//  To INHERIT from another class, you must specify that class using 'extends'
public class Dog extends Animal {

    //  All dogs, but NOT all animals, have these characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /*
    //  Constructor for Dog, initializes Animal first
    public Dog(String name, int brain, int body, int size, int weight) {
        //  Initialize basic characteristics of Animal class
        //  'super' means to call the constructor of the class we are extending/inheriting from
        super(name, brain, body, size, weight);
    }
    */

    //  Simplify commented out function, and add Dog variables
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog is chewing");
    }

    //  Instead of making chew(), we can OVERRIDE the Animal eat() method with one specific for Dog
    @Override
    public void eat() {
        System.out.println("Dog is eating");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking");
        super.move(5);     //  If just move(), will choose in Dog class, then in super class (Animal)
    }

    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog's legs are moving at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving");
        moveLegs(speed);
        super.move(speed);
    }
}
