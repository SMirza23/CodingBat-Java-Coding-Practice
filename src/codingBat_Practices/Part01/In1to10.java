package codingBat_Practices.Part01;

public class In1to10 {

    // public boolean in1To10(int n, boolean outsideMode) {

    //   if(n == 1 || n == 10){
    //     return true;
    //   }

    //   boolean valid = n >= 1 && n <= 10;

    //   return outsideMode ? !valid : valid;
    // }

    public static boolean in1To10(int n, boolean outsideMode) {

        if(outsideMode){
            return n <= 1 || n >= 10; // outside 1 - 10
        } else {
            return n >= 1 && n <= 10; // in the range of 1-10
        }
    }

/*
Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.


in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
 */


}
