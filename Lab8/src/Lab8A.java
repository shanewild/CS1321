import java.util.Scanner;

public class Lab8A {

    public static void main (String[]Args){
        /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 8A
*/
        int temp;
        int swaps=0;
        int j;
        Scanner scan =new Scanner(System.in);
        int[] array = new int[10];
        for (int k=0; k<10;k++){
            System.out.print("Enter slot "+k+": ");
            array[k]= scan.nextInt();
        }
        for (int i =0; i<11; i++){
            if (i!=0) {
                System.out.println(array[0] + "|" + array[1] + "|" + array[2] + "|" + array[3] + "|" + array[4] + "|" + array[5] + "|" + array[6] + "|" + array[7] + "|" + array[8] + "|" + array[9] + "| Num Swaps: " + swaps);
            }
            j=0;
            while(j<9){
                if (array[j+1]<array[j]) {
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swaps +=1;

                }
                j++;
            }
        }
    }

}
