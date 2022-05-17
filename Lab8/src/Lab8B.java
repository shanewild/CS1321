import java.util.Scanner;

public class Lab8B {

        public static void main (String[]Args){
        /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 8B
*/
            Scanner scan = new Scanner(System.in);
            int target;
            int[] array = new int[15];
            for (int i=0; i<15;i++){
                System.out.print("Enter slot "+i+": ");
                array[i]=scan.nextInt();
            }
            System.out.print("Enter a target: ");
            target= scan.nextInt();
            for (int j=0; j<15;j++){
                System.out.print(array[j]+"|");
            }
            System.out.println("");
            //linear
            for (int i=0;i<15;i++){
                System.out.print(i+" ");
               if (array[i]==target){
                   break;
               }
            }

            //binary
            int low =0;
            int mid;
            int high =array.length-1;
            System.out.println("");
            while(high>=low) {
                mid = (low + high) / 2;

                System.out.print(mid+" ");
                if (target < array[mid]) {
                high = mid - 1;
            }
                else if(target>array[mid]){
                    low = mid + 1;
                }
                else{
                    break;
                }
            }
        }
    }


