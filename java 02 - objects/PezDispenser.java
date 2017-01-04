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
  public void fill() {
    pezCount = MAX_PEZ;
  }

  //  Method to determine if the PEZ dispense is empty
  public boolean isEmpty() {
    return pezCount == 0;
  }

  public String getCharacterName() {
    return characterName;
  }


}
