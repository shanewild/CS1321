import java.util.Scanner;

public class Assignment6A {
    public static void main(String[] args){
        float r, g,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a red value (0-255): ");
        r=scan.nextInt();
        System.out.print("Enter a green value (0-255): ");
        g=scan.nextInt();
        System.out.print("Enter a blue value (0-255): ");
        b=scan.nextInt();
        rgb(r,g,b);
    }
    public static void rgb(float r, float g, float b){
        float redpercent, greenpercent,bluepercent;
        redpercent=r/255;
        greenpercent=g/255;
        bluepercent=b/255;
        System.out.println("New color is red="+redpercent+", green="+greenpercent+", blue="+bluepercent);

    }
}
