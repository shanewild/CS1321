import java.util.Scanner;

public class Assignment3C {
    public static void main(String[] Args) {
                 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Assignment#: 3C
*/
        double pnumber;
        double cost;
        double bill;
        double tip;
        String YN;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people in your party? ");
        pnumber = scan.nextInt();
        System.out.print("What is the total cost of your bill? ");
        cost = scan.nextInt();
        if (pnumber == 6){
            bill = cost*1.18;
            System.out.println("Your bill is $" + bill);
            System.out.print("Would you like to include an additional tip (Y/N)? ");
            YN = scan.next();
        if (YN.equals("Y")){
            System.out.print("How much? ");
            tip = scan.nextInt();
            bill += tip;
            System.out.println("Total bill is: $"+ bill);
        }
        else{
            System.out.println("Total bill is: $" +bill);
        }
        }
        else{
            System.out.println("Your bill is $" +cost);
            System.out.print("How much for the tip? ");
            tip = scan.nextInt();
            bill = cost + tip;
            System.out.println("Total bill is: $" + bill);
        }
    }
}
