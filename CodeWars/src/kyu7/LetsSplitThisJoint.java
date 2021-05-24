package kyu7;
/*
 * Developed skills: bugs.
 * 
 * The code provided is supposed return an array of items that were separated in the joint string by .
 * But it's not working properly.
 * Notes
 * A zero length input joint string should yield an empty output array
 * Empty items are preserved
 */

public class LetsSplitThisJoint {

  public static String[] split(final String joint) {
    String[] newString = new String[joint.length()];
    
    if (joint == "") {
      return newString;
    }
    
    return joint.split("\\.", -1);
  }
  
}