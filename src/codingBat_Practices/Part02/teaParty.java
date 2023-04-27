package codingBat_Practices.Part02;

public class teaParty {

    public static void main(String[] args) {
        System.out.println(teaParty(6, 8)); //1
        System.out.println(teaParty(3, 8)); //0


    }




    public static int teaParty(int tea, int candy) {

        boolean good = tea >=5 && candy >= 5;
        boolean great = tea >= candy *2 || tea*2 <= candy;

//  return great? 2: good? 1:0;
        return !good ? 0 : great ? 2 :1;

        // in one line
        //return tea < 5 || candy <5 ? 0: tea >= candy *2 || tea*2 <= candy ? 2:1;
    }
}
