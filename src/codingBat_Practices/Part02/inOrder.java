package codingBat_Practices.Part02;

public class inOrder {

    public static class InOrder { // https://codingbat.com/prob/p154188
        public static boolean inOrder(int a, int b, int c, boolean bOk) {

            boolean boolC = c > b;
            boolean boolB = b > a;

            return boolC && (bOk || boolB);

        }

        public static void main(String[] args) {
            System.out.println(inOrder(1, 2, 4, false));
        }

    }


    /*


Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.


inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
     */


    public boolean inOrder(int a, int b, int c, boolean bOk) {

        boolean boolC = c > b;
        boolean boolB = b > a;

        return boolC && (bOk || boolB);

    }

}
