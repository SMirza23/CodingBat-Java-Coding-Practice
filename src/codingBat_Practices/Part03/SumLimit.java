package codingBat_Practices.Part03;

public class SumLimit {
    public int sumLimit(int a, int b) {

        int sum = a + b;

        if(String.valueOf(sum).length() > String.valueOf(a).length()){
            return a;
        } else {
            return sum;
        }

    }

}
