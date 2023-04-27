package codingBat_Practices.Part02;

public class TwoAsOne {

    public boolean twoAsOne(int a, int b, int c) {

        boolean one = a + b == c;
        boolean two = a + c == b;
        boolean three = b + c == a;

        return one || two || three;

    }


    /*
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false

     */

}
