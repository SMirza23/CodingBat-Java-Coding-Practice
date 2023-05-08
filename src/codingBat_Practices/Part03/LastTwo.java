package codingBat_Practices.Part03;

public class LastTwo {
    public String lastTwo(String str) {

        if(str.length() < 2){
            return str;
        }

        int lastIndex = str.length() - 1;
        return str.substring(0, lastIndex - 1) + str.charAt(lastIndex) + str.charAt(lastIndex - 1);
    }
}
/*

Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */