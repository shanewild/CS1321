import java.util.Scanner;

public class Assignment4A {
public static void main(String [] Args){
    int seed1;
    int seed2;
    int iterations;
    int sum;
    System.out.println("Enter seed 1: ");
    Scanner scan =new Scanner(System.in);
    seed1 = scan.nextInt();
    System.out.println("Enter seed 2: ");
    seed2 = scan.nextInt();
    System.out.println("Number of iterations: ");
    iterations = scan.nextInt();
    System.out.print(seed1 +"," + seed2);
    for (int i=0;i<iterations;i++){
        sum = seed1+seed2;
        seed1 =seed2;
        seed2 = sum;
        System.out.print(","+sum);
    }

}
}
