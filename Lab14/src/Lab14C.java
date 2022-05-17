import java.util.Scanner;

public class Lab14C {
    private static void matrix(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+arr[i][j]);

            }
        }
        System.out.println();
    }
    private static void addArrays(int[][] a1, int[][] a2){
       int[][] ab=new int[3][3];
        for (int i =0; i<3; i++){
            for (int j=0;j<3;j++){
            ab[i][j]=a1[i][j]+a2[i][j];
            }
        }
        matrix(ab);
    }
    /* Class: CSE 1321L
                    Section: 05
                    Term: Fall
                    Instructor: Vishal
                    Name: Shane Wild
                    Lab#: 14C
            */
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);
        int[][] arr1=new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Enter a value: ");
                arr1[i][j]=scan.nextInt();

            }
        }
        int[][] arr2=new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Enter a value: ");
                arr2[i][j]=scan.nextInt();

            }

        }
        System.out.print("Matrix A: ");
        matrix(arr1);
        System.out.print("Matrix B: ");
        matrix(arr2);
        System.out.print("A + B: ");
        addArrays(arr1,arr2);
    }
}
