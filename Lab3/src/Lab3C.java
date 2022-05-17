import java.util.Scanner;

public class Lab3C {
    public static void main(String[] args) {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 3B
*/
        int q;
        int d;
        int n;
        int p;
        double cents;
        double total;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        q = scan.nextInt();
        System.out.print("Enter the number of dimes: ");
        d = scan.nextInt();
        System.out.print("Enter the number of nickels: ");
        n = scan.nextInt();
        System.out.print("Enter the number of pennies: ");
        p = scan.nextInt();
        System.out.println("You entered "+ q + " quarters.");
        System.out.println("You entered " + d + " dimes.");
        System.out.println("You entered " + n + " nickels.");
        System.out.println("You entered " + p + " pennies.");

total = (q*.25) + (d*.1) + (n*.05) + (p * .01);

cents = total % 1 *100;
        cents = Math.round(cents*100)/100;
        total = Math.round(total*100)/100;
  /*  System.out.println(total +  " " + cents + " " + p); */

    System.out.println(("Your total is " + (int)total) + " dollars and " + (int)cents + " cents.");
    }}