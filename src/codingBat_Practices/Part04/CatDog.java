package codingBat_Practices.Part04;

public class CatDog {

    public boolean catDog(String str) {

        int cat = 0;
        int dog = 0;

        for(int i = 0; i < str.length() - 2; i++){
            String part = str.substring(i , i + 3);

            if(part.equals("cat")){
                cat++;
            } else if(part.equals("dog")){
                dog++;
            }
        }

        return cat == dog;
    }

/*
1cat1cadodog

1ca  (0, 3)
cat  (1, 4)
at1 (2, 5)
t1c (3, 6)
..


*/
}

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */