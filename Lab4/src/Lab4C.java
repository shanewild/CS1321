import java.util.Scanner;

public class Lab4C {
    public static void main(String[] args) {
                /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 4C
*/
        int number;
        System.out.println("Select from the following:\n" +
                "To see a list of movies, press 1.\n" +
                "To see show times, press 2.\n" +
                "To pay your bill, press 3.\n" +
                "Choice: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if (number == 1){
            System.out.println("The Neverending Story 6\n" +
                    "Princess Diaries: the untold story\n" +
                    "Monty Python and the Programmer");

        }
        else if(number == 2) {
            System.out.println("All movies play at 3PM.");
        }
        else if (number == 3){
            System.out.println("Corporate accounts payable, Nina speaking.\n" +
                    "Just a moment!");
        }
        else{
            System.out.println("I'm sorry, Dave. I can't do that.");
        }
    }
}
