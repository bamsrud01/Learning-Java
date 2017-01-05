public class Example {

  public static void main(String[] args) {
    //  Create a PEZ dispenser object
    System.out.println("We are making a PEZ Dispenser");
    //  Use the constant value of max PEZ
    System.out.printf("There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);
    //  Create a new PEZ dispenser object
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("This dispenser is %s %n", dispenser.getCharacterName());
    if (dispenser.isEmpty()) {
      System.out.println("Dispenser is empty!");
    }
    System.out.println("Filling the dispenser with PEZ...");
    dispenser.fill();
    if (!dispenser.isEmpty()) {
      System.out.println("Dispenser is not empty.");
    }
    //  While loop to dispense pez while it is still in the dispenser
    while (dispenser.dispense()) {
      System.out.println("Chomp!");
    }
    if (dispenser.isEmpty()) {
      System.out.println("Ate it all!");
    }

  }

}
