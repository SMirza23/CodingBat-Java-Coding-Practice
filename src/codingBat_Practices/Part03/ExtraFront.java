package codingBat_Practices.Part03;

public class ExtraFront {

    public String extraFront(String str) {

        String begin = "";

        if(str.length() >= 2){
            begin = str.substring(0,2);
        } else {
            begin = str;
        }

        return begin + begin + begin;
    }


   /* Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.


    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"*/

}
