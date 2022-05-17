import java.util.Scanner;

public class Lab6C {
    public static void main(String[] Args){
/* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 6C
*/
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int sum = 0;
        System.out.print("Enter a starting number: ");
        num1 = scan.nextInt();
        System.out.print("Enter an ending number: ");
        num2 = scan.nextInt();
        if (num1<num2){
        while (num1 <= num2) {
            if (num1 % 2 == 1) {
                sum += +num1;
            }
            num1++;
        }
        }
        else if (num1>num2){
            while (num1 >= num2) {
                if (num1 % 2 == 1) {
                    sum += +num1;
                }
                num1--;
        }
            
    }
        System.out.println("Sum of odds is: "+sum);
}}
