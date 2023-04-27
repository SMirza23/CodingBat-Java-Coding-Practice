package codingBat_Practices.Part02;

public class LastDigit {

    public static boolean lastDigit(int a, int b, int c) {

        // doing number % 10 will give the last digit of the number
        a = a % 10;
        b %= 10;
        c %= 10;

        return a == b || b == c || c == a;

    }
// 3 % 10 => 3 3:10 est








    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
     */


}
