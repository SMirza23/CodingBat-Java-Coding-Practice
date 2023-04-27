package codingBat_Practices.Part01;

public class CaughtSpeeding {

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(80, false)); //1
    }



    public static int caughtSpeeding(int speed, boolean isBirthday) {

        int min = isBirthday ? 66 : 61;
        int limit = isBirthday ? 85 : 80;

        if(speed >= min && speed <= limit){
            return 1;
        } else if(speed > limit){
            return 2;
        }

        return 0; // speeds under 61
    }

/*
  int min = 61;
  int limit = 80;

  if(isBirthday){
    min += 5;
    limit += 5;
  }


You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the resultis 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
*/
}
