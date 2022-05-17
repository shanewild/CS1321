import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args) {
 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 2C
*/
        int width;
        int height;
        int area;
        int perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = scan.nextInt();
        System.out.print("Enter a Height: ");
        height = scan.nextInt();
        area = height*width;
        System.out.println("The area is " + area);
        perimeter = (2 * width) + (2 * height);
        System.out.println("The Perimeter is " + perimeter);

}}
