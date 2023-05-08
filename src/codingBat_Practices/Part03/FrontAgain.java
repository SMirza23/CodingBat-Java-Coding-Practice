package codingBat_Practices.Part03;

public class FrontAgain {

    // https://codingbat.com/prob/p196652
    public boolean frontAgain(String str) {
        return str.length() > 1 && str.endsWith(str.substring(0, 2));
    }





/*
  public boolean frontAgain(String str) {

  if(str.length() < 2){
   return false;
  }
 return str.endsWith(str.substring(0,2));
 */
}
/*

Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */