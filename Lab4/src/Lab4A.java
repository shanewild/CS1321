import java.util.Scanner;

public class Lab4A {
    public static void main(String[] Args) {
        /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 4A
*/
        String day;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day: ");
        day = scan.next();
        if (day.equals("Monday")) {
            System.out.println("Sounds like someone has a case of the Mondays!");

        } else if (day.equals("Wednesday")) {
            System.out.println("It's hump day! El ombligo!");
        } else if (day.equals("Friday")) {
            System.out.println("Finally. It's Friday!");
        } else {
            System.out.println("It's another day of the week.");
        }
    }

}
