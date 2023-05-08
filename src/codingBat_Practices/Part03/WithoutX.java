package codingBat_Practices.Part03;

public class WithoutX {
    public String withoutX(String str) {

        if(str.startsWith("x")){
            str = str.substring(1);
        }
        if(str.endsWith("x")){
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
/*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */