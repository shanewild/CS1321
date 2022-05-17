import java.util.Scanner;

public class Lab6B {
    public static void main(String[] Args) {
/* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 6B
*/

        int number;
        int min = 1001;
        int max = -1001;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter a number between -1000 and +1000: ");
            number = scan.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println("Min is " + min);
            System.out.println("Max is " + max);

        } while (number != 0);
    }}
