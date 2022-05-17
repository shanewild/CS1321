import java.util.Scanner;
class Lab3A{
    public static void main(String[] args){
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 3A
*/
        float owed;
        float apr;
        float mpr;
        float minpayment;
        Scanner scan = new Scanner(System.in);
        System.out.print("Amount owed: $");
        owed =  scan.nextFloat();
        System.out.print("APR: ");
        apr =  scan.nextFloat();
        mpr = apr/12;
        System.out.println ("Monthly percentage rate: " + mpr);
        minpayment = owed * apr / 12 * .01f;
        System.out.print("Minimum payment: $" + minpayment);


    }
}