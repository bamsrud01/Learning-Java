public class Main {

    public static void main(String[] args) {

        //  Real world objects have STATES/TRAITS and BEHAVIORS
        //  A CLASS is a template from which objects are based and created

        //  We can use the Car class by creating an object
        Car porsche = new Car();    //  Created an object, 'porsche', from the class template 'Car'
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        //  Use the constructor
        Car myCar = new Car(4, 4, "Kia Soul", "An engine", "Green");
    }
}
