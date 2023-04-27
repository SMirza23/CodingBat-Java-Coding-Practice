package codingBat_Practices.Part01;

public class squirrelPlay {

    public static boolean squirrelPlay(int temp, boolean isSummer) {

        int maxRange = isSummer ? 100 : 90;

  /*
    int maxRange = 0;
    if(isSummer){
      maxRange = 100;
    }else {
      maxRange = 90;
    }
  */

        return temp >= 60 && temp <= maxRange;
    }
}
/*
The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.


squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
 */