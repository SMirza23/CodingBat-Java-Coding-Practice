package codingBat_Practices.Part02;

public class fizzString {
    public static void main(String[] args) {


        System.out.println(fizzString("fig"));


    }
    public static String fizzString(String str){

    boolean f = str.startsWith("f"); // str.charAt(0) == 'f';
    boolean b = str.endsWith("b"); // str.charAt(str.length()-1);

        if ((f & b)) {
            return  "FizzBuzz";
         }  else if (f){
            return "Fizz";
        }else  if (b){
            return "Buzz";

        }else {
            return str;
        }
     //  return  f &&b? "FizzBuzz": f? "Fizz":b?"Buzz":str;
    }



    /*

Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
     */



}
