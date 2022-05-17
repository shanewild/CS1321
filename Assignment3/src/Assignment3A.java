import java.util.Scanner;

public class Assignment3A {
    public static void main(String[] Args) {
                 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Assignment#: 3A
*/
        Scanner scan =  new Scanner(System.in);
        String guest1;
        String guest2;

        System.out.print("Enter guest 1: ");
        guest1 = scan.nextLine();
        System.out.print("Enter guest 2: ");
        guest2 = scan.nextLine();
        if (guest1.equals("Taylor") && guest2.equals("Fernando") || guest1.equals("Fernando") && guest2.equals("Taylor") ){
            System.out.println("Your party is ruined and another bad pop song will be written.");
        }
        else{
            System.out.println("Your party was a hit!");
        }
    }
}
