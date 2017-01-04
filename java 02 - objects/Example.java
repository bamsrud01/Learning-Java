public class Example {

  public static void main(String[] args) {
    //  Create a PEZ dispenser object
    System.out.println("We are making a PEZ Dispenser");
    //  Use the constant value of max PEZ
    System.out.printf("There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);
    //  Create a new PEZ dispenser object
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("This dispenser is %s %n", dispenser.getCharacterName());
    //  Change the characterName property on this instance of the PezDispenser object

  }

}
