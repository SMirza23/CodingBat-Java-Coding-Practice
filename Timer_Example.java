package JavaClass.day01_introToProgramming;

import java.util.Scanner;

public class Timer_ClassVideo {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        int minutes=scan.nextInt();


        for (int i=minutes; i > 0; i--) {
            for (int z=59; z >= 0; z--) {
                System.out.print("\r" + (i - 1) + " minutes and " + z + " seconds left");
                Thread.sleep(1000);
            }
        }

        System.out.println("\n\n");
        System.err.println("\t********************************************************");
        System.err.print("\t*                          ");
        System.err.print("\t  Timer is off");
        System.err.print("\t                             *");
        scan.close();
    }}