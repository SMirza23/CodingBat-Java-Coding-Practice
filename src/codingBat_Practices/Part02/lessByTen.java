package codingBat_Practices.Part02;

public class lessByTen {
    /*
    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
     */

    public class LessBy10 { // https://codingbat.com/prob/p179196
        public boolean lessBy10(int a, int b, int c) {

            boolean ab = Math.abs(a - b) >= 10;
            boolean bc = Math.abs(b - c) >= 10;
            boolean ac = Math.abs(a - c) >= 10;

            return ab || bc || ac;
        }

// Math.abs() -> returns the value, ignore positive/negative
// |-4| -> 4
// Math.abs(-4) -> 4

    }
}
