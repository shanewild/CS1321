import java.util.Scanner;

public class Lab7A {
    public static void main(String[] Args) {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 7A
*/
        Scanner scan = new Scanner(System.in);
        int userInput;
        System.out.print("Enter the size of the array: ");
        userInput = scan.nextInt();
        int[] myArray = new int[userInput];
        for (int i=0; i< myArray.length; i++) {
            System.out.print("|"+ i * i);
        }

    }
}
