import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args) {
        double horizontal;
        double vertical;
        double length;
        double diagpixels;
        double ppi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Horizontal pixels: ");
        horizontal = scan.nextDouble();
        System.out.println("Vertical pixels: ");
        vertical = scan.nextDouble();
        System.out.println("Diagonal length in inches:");
        length = scan.nextDouble();
        diagpixels = Math.sqrt(vertical * vertical + horizontal * horizontal);
        ppi = diagpixels/ length;

        System.out.println("Pixels per inch: " + (int)ppi);


    }
}
