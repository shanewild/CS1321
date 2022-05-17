import java.util.Scanner;

public class Lab7C {
    public static void main(String[] Args) {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 7C
*/
        Scanner scan = new Scanner(System.in);
        int arraySize;
        boolean identical = true;
        System.out.print("Enter the size of the arrays: ");
        arraySize = scan.nextInt();
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        for (int i=0; i<arraySize; i++){
            System.out.print("Enter array 1 slot"+i+":");
            array1[i] = scan.nextInt();
            System.out.print("Enter array 2 slot"+i+":");
            array2[i] = scan.nextInt();
        }
        for (int i=0; i<arraySize; i++){
            if (array1[i] != array2[i]){
                identical=false;
            }

        }
        if (identical){
            System.out.println("The arrays are identical");
        }
        else {
            System.out.println("The arrays are not identical");
        }



    }
}
