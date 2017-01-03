public class Example {

  public static void main(String[] args) {
    //  Create a PEZ dispenser object
    System.out.println("We are making a PEZ Dispenser");
    //  Create a new PEZ dispenser object
    PezDispenser dispenser = new PezDispenser();
    System.out.printf("This dispenser is %s %n", dispenser.getCharacterName("Yoda"));
    //  Change the characterName property on this instance of the PezDispenser object

  }

}
