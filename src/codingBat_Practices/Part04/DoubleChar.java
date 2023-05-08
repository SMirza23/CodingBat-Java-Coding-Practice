package codingBat_Practices.Part04;

public class DoubleChar {

    public String doubleChar(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++){
            result += "" + str.charAt(i) + str.charAt(i);
        }

        return result;
    }

// public String doubleChar(String str) { // WWoorrdd

//   for(int i = 0; i < str.length(); i+= 2){
//     str = str.substring(0, i) + str.charAt(i) + str.substring(i);
//   }

//   return str;
// }


}
/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */