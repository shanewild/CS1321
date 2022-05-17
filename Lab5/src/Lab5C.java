import java.util.Scanner;

public class Lab5C {
    public static void main(String[] Args){
                 /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 5C
*/
        Scanner scan = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Enter x: ");
        x = scan.nextInt();
        System.out.print("Enter y: ");
        y = scan.nextInt();
        if (x==0 && y==0){
            System.out.println("This point is the origin.");
        }
        if (x==0 && y!=0){
            System.out.println("This point is on the y axis.");
        }
        if (x!=0 && y==0) {
            System.out.println("This point is on the x axis.");
        }
        if (x>0 && y>0){
            System.out.println("This point is in the first quadrant.");

        }
        if (x<0 && y>0){
            System.out.println("This point is in the second quadrant.");
        }
        if (x<0 && y<0){
            System.out.println("This point is in the third quadrant.");
        }
        if (x>0 && y<0){
            System.out.println("This point is in the fourth quadrant.");
        }

    }
}
