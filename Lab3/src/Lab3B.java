import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args){
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 3B
*/
    float c1;
    float g1;
    float c2;
    float g2;
    float c3;
    float g3;
    float c4;
    float g4;
    float hrs;
    float points;
    float GPA;
    Scanner scan = new Scanner(System.in);
    System.out.print("Course 1 hours: ");
    c1 = scan.nextFloat();
    System.out.print("Grade for course 1: ");
     g1 = scan.nextFloat();
    System.out.print("Course 2 hours: ");
    c2 = scan.nextFloat();
    System.out.print("Grade for course 2: ");
    g2 = scan.nextFloat();
    System.out.print("Course 3 hours: ");
    c3 = scan.nextFloat();
    System.out.print("Grade for course 3: ");
    g3 = scan.nextFloat();
    System.out.print("Course 4 hours: ");
    c4 = scan.nextFloat();
    System.out.print("Grade for course 4: ");
    g4 =scan.nextFloat();
    hrs = c1 + c2 + c3 + c4;
    points= c1 * g1 + c2 * g2 + c3 * g3 + c4 * g4;
    GPA =  points / hrs;
    System.out.println("Total hours is: " + hrs);
    System.out.println("Total quality points is: " + points);
    System.out.print("Your GPA for this semester is " + GPA);


}}
