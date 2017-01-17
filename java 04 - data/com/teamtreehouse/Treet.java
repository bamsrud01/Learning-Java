//  Packages: Help to distinguish class names from other we are using
  //  Convention is to name packages as the reverse of the domain names
  //  For example: whitehouse.gov -> gov.whitehouse

//  Declare file as part of the package
package com.teamtreehouse;

//  Import Date
import java.util.Date;

//  Declare class
public class Treet {
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;

  public Treet(String author, String description, Date creationDate) {
    mAuthor = author;
    mDescription = description;
    mCreationDate = creationDate;
  }

  //  Getter methods
  
  public String getAuthor() {
    return mAuthor;
  }

  public String getDescription() {
    return mDescription;
  }

  public Date getCreationDate() {
    return mCreationDate;
  }
}
