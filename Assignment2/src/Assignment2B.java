import java.util.Scanner;

public class Assignment2B {
    public static void main(String[] args) {

        double width;
        double length;
        double sft;
        double sftpd;
        double dots;
        Scanner scan = new Scanner(System.in);
        System.out.println("Width:");
        width = scan.nextDouble();
        System.out.println("Length:");
        length = scan.nextDouble();
        System.out.println("Square feet per dot:");
        sftpd = scan.nextDouble();
        sft = width * length;
        dots = sft / sftpd;
        System.out.println("A yard of " + (int)sft + " square feet will take " + dots + " dots to cut.");





    }
}