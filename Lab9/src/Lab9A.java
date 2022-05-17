import java.util.Scanner;

public class Lab9A {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 9A
*/
    public static void main(String[] Args){
        int x,y,z;
        System.out.println("Enter number 1: ");
        Scanner scan = new Scanner(System.in);
        x= scan.nextInt();
        System.out.println("Enter number 2: ");
        y= scan.nextInt();
        System.out.println("Enter number 3: ");
        z= scan.nextInt();
        System.out.println("Min is "+min(x,y,z));
        System.out.println("Max is "+max(x,y,z));
        System.out.println("Average is "+average(x,y,z));


    }
    public static double average (int x, int y, int z) {
        double average;
        average=((double)x+(double)y+(double)z)/3;
        return average;
    }
    public static int max (int x, int y, int z) {
        int max=-9999;
        if (x>max){
            max=x;
        }
        if (y>max){
            max=y;
        }
        if (z>max){
            max=z;
        }
        return max;
    }
    public static int min (int x, int y, int z) {
        int min=9999;
        if (x<min){
            min=x;
        }
        if (y<min){
            min=y;
        }
        if (z<min){
            min=z;
        }
        return min;
    }
}

