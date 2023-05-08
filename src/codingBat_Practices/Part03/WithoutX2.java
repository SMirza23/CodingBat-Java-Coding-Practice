package codingBat_Practices.Part03;

public class WithoutX2 {

    public String withoutX2(String str) {

        if(str.length() < 2) {
            return "";
        }

        String result = str.substring(2);

        if(str.charAt(1) != 'x'){
            result = str.charAt(1) + result;
        }

        if(str.charAt(0) != 'x'){
            result = str.charAt(0) + result;
        }

        return result;

    }
}
/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */