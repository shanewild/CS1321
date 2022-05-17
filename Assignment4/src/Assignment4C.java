import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] Args) {
        int userInput;
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Width: ");
        userInput = scan.nextInt();
        for (int y = 0; y < userInput; y++) {
            if (y != 0) {
                //  System.out.print("\n");
                result = result + "\n";
            }
            for (int x = 0; x < userInput; x++) {

                if (x != 0 && x != userInput - 1 && y != 0 && y != userInput - 1) {
                    //System.out.print("  ");
                    result = result + "  ";
                } else {
                    //System.out.print("* ");
                    result = result + "* ";

                }

            }
        }
        System.out.print(result.trim());
    }
}
