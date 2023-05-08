package codingBat_Practices.Part03;

public class MinCat {



        public String minCat(String a, String b) {

            int min = Math.min(a.length(), b.length()); // returns the smaller length

            return a.substring(a.length() - min) + b.substring(b.length() - min);

        }

/*
INSTEAD OF USING MATH.MIN:
int min;

if(a.length() < b.length(){
  min = a.length();
} else {
  min = b.length();
}




Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/

   }