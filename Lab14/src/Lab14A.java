import java.util.Scanner;

public class Lab14A {
     private static void matrix(int[][] arr) {
        System.out.println("The entered matrix: ");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+arr[i][j]);

            }
        }
         System.out.println();
    }
    private static void columnTotal(int[][] arr){
         int temp=0;
        for (int i = 0; i < 4; i++) {
            temp = 0;
            for (int j = 0; j < 3; j++) {
                temp += arr[j][i];
                if (j==2){
                    System.out.println("Sum of column " + i + " is " + temp);
                }
            }
        }

    }
    private static void rowTotal(int [][]arr) {
        int temp=0;
        for (int i = 0; i < 3; i++) {

            temp=0;
            for (int j = 0; j < 4; j++) {
            temp+=arr[i][j];
                if (j==3) {
                    System.out.println("Sum of row " + i + " is " + temp);
                }
            }

        }

    }
    /* Class: CSE 1321L
                    Section: 05
                    Term: Fall
                    Instructor: Vishal
                    Name: Shane Wild
                    Lab#: 14A

            */
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        int[][] arr=new int[3][4];
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.println("Enter a value: ");
                arr[i][j]=scan.nextInt();

            }
        }
        matrix(arr);
        columnTotal(arr);
        rowTotal(arr);

    }
}
