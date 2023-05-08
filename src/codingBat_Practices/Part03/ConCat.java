package codingBat_Practices.Part03;

public class ConCat {
    public String conCat(String a, String b) {

        if(a.isEmpty() || b.isEmpty()){
            return a + b;
        }

        if(a.endsWith(b.substring(0,1))){
            return a + b.substring(1);
        }

        return a + b;
    }

}
/*

Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

 */