import java.util.Scanner;

public class Lab5A {
    public static void main(String[] Args){
                 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 5A
*/
        String userinput;
        System.out.print("Experiencing severe symptoms (Y/N)? ");
        Scanner scan = new Scanner(System.in);
        userinput = scan.nextLine();
        if (userinput.equals("Y")){
            System.out.println("Seek emergency care.");
        }
    else if(userinput.equals("N")){
            System.out.print("Close contact with someone who has COVID (Y/N)? ");
            userinput = scan.nextLine();
            if (userinput.equals("Y")){
                System.out.println("Quarantine and get tested if you feel sick.");
            }
            else if (userinput.equals("N")){
                System.out.println("If you experience other symptoms, isolate and get tested.");
            }
        }
    }
}
