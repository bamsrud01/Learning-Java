class PezDispenser {
  //  Inside the class scope

  //  Constants generally are written in all caps.
  //  The final keyword prevents it from being assigned a new value
  public static final int MAX_PEZ = 12;

  //  The keyword 'private' here ensures that other files in the same package cannot access the variable
  private String characterName;

  //  Integer holding the number of PEZ in the dispenser
  private int pezCount;

  //  Build a constructor with the same name as the class
  public PezDispenser(String characterName) {
    //  Use this to limit the assignment to this instance only
    this.characterName = characterName;
    pezCount = 0;
  }

  //  The keyword void means it doesn't return anything
  //  It is possible to have two methods with the same name.
    //  No argument calls the first, one argument calls the second
    //  This is called 'overloading' the method
  public void fill() {
    fill(MAX_PEZ);
  }

  public void fill(int pezAmount) {
    int newAmount = pezCount + pezAmount;
    if (newAmount > MAX_PEZ) {
      throw new IllegalArgumentException("Too many PEZ!");
    }
    pezCount = newAmount;
  }

  //  Method to dispense PEZ
  public boolean dispense() {
    boolean wasDispensed = false;
    if (!isEmpty()) {
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }

  //  Method to determine if the PEZ dispense is empty
  public boolean isEmpty() {
    return pezCount == 0;
  }

  public String getCharacterName() {
    return characterName;
  }


}
