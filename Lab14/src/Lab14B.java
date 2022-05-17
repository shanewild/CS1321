import java.util.Scanner;

public class Lab14B {
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
    /*
    private int findMin(int[][]arr){
        int min=999,atrow=0,atcolumn=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                if (arr[i][j]<min){
                    min=arr[i][j];
                    atcolumn=i;
                    atrow=j;
                }
            }
        }


return min;
}
        */

    private  static String findMax(int[][]arr) {
        int max = -999, atrow = 0, atcolumn = 0;
        String output;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    atrow = i;
                    atcolumn = j;
                }
            }
        }
        output="First largest value is located at row "+atrow+" and column "+atcolumn;
        return output;
    }
    /* Class: CSE 1321L
                    Section: 05
                    Term: Fall
                    Instructor: Vishal
                    Name: Shane Wild
                    Lab#: 14B
            */
    public static void main(String []Args){
        Scanner scan = new Scanner(System.in);
        int[][] arr=new int[3][4];
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.println("Enter a value: ");
                arr[i][j]=scan.nextInt();

            }
        }
        matrix(arr);
        System.out.println(findMax(arr));
    }
}
