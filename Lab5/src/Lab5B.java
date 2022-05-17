import java.util.Scanner;

public class Lab5B {
    public static void main(String[] Args){
                 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 5B
*/
        int input1;
        int input2;
        int total;
        int day;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
        input1 = scan.nextInt();
        System.out.print("Enter the number of days until the meeting: ");
        input2 = scan.nextInt();
        total = input1+input2;
        day = total%7;
        switch (day){
            case 0:
                System.out.println("Meeting day is Sunday");
                break;
            case 1:
                System.out.println("Meeting day is Monday");
                break;
            case 2:
                System.out.println("Meeting day is Tuesday");
                break;
            case 3:
                System.out.println("Meeting day is Wednesday");
                break;
            case 4:
                System.out.println("Meeting day is Thursday");
                break;
            case 5:
                System.out.println("Meeting day is Friday");
                break;
            case 6:
                System.out.println("Meeting day is Saturday");
                break;


        }
    }
}
