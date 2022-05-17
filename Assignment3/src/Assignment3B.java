import java.util.Scanner;

public class Assignment3B {
    public static void main(String[] Args) {
                 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Assignment#: 3B
*/
        int first;
        int second;
        String operator;
        int total;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        first = scan.nextInt();
        System.out.print("Enter the second number: ");
        second = scan.nextInt();
        System.out.print("Enter the operator to apply: ");
        operator = scan.next();

        switch (operator){
           case "+":
                total = first + second;
                System.out.println(total);
                break;
            case "-":
                total = first - second;
                System.out.println(total);
                break;
            case "*":
                total = first * second;
                System.out.println(total);
                break;
            case "/":
                total = first / second;
                System.out.println(total);
                break;
            case "%":
                total = first % second;
                System.out.println(total);
                break;
        }
    }
}

