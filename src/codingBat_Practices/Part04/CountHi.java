package codingBat_Practices.Part04;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        while(str.contains("hi")){
            str = str.replaceFirst("hi", "");
            count++;
        }

        return count;
    }
}

/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */