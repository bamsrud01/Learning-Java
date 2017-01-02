class PezDispenser {
  //  Inside the class scope

  //  The keyword 'private' here ensures that other files in the same package cannot access the variable
  private String characterName;

  //  Build a constructor with the same name as the class
  public PezDispenser(String characterName) {
    //  Use this to limit the assignment to this instance only
    this.characterName = characterName;
  }

  public String getCharacterName() {
    return characterName;
  }


}
