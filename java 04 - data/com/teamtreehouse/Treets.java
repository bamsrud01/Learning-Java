package com.teamtreehouse;

import java.io.*;

public class Treets {
  public static void save(Treet[] treets) {
    try (
      FileOutputStream fos = new FileOutputStream("treets.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
    ) {
      oos.writeObject(treets);
    } catch(IOException ioe) {
      System.out.println("Problem saving Treets");
      ioe.printStackTrace();
    }
  }
}
