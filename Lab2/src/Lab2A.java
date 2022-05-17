import java.util.Scanner;
public class Lab2A
/* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 2A
*/
        {public static void main (String[] args) {
            //data_type <variable>
            String name1;
            String name2;
            String verb;
            String adverb;

            System.out.print("Enter a name: ");
            Scanner scan = new Scanner(System.in);
            name1 = scan.nextLine();
            //System.out.print("You entered: "+name1);
            System.out.print("Enter another name: ");
            name2 = scan.nextLine();
            System.out.print("Enter a verb: ");
            verb = scan.nextLine();
            System.out.print("Enter an adverb: ");
            adverb = scan.nextLine();
            System.out.print("Once upon a time, there was a person named " + name1);
            System.out.print(" who had a child named " + name2);
            System.out.println(". This child would " + verb + " " + adverb + " while singing to strangers.");

        }
}
