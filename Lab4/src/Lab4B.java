import java.util.Scanner;

public class Lab4B {
    public static void main(String [] Args){
        /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 4B
*/
        int hours;
        int overtime;
        int earnings;


        Scanner scan = new Scanner(System.in);
        System.out.print("Number of hours this week: ");
        hours = scan.nextInt();
        if (hours <= 40){
            earnings = hours * 15;
            System.out.println("Earnings: $"+ earnings);
        }
        else if (hours >40 ){
            overtime = hours - 40;
            hours -= overtime;
            earnings = (hours*15)+(overtime*25);
            System.out.println("Earnings: $"+ earnings);

        }


    }
}
