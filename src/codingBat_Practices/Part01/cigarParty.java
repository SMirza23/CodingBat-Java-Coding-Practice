package codingBat_Practices.Part01;

public class cigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {

        boolean validRange = cigars >= 40 && cigars <= 60;
        boolean secondValid = isWeekend && cigars >= 40;

        return validRange || secondValid;

    }

    public static void main(String[] args) {
        System.out.println(cigarParty(20, true)); //false
    }



// shouldn't do this: isWeekend == false
// instead do it this way: !isWeekend
}

/*

    To test/run any of the methods you need to:
        - either create an instance of the class, or make the methods static
        - create a main method to call the method and give arguments


When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true


 */

