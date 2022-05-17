import java.util.Scanner;

public class Assignment5B {
    public static void sort (int[] arr, int[] yeararr){
       for(int i=0; i< arr.length;i++){
        for (int j=0; j<arr.length-1;j++) {
            int temp;
            int yeartemp;
            if (arr[j + 1] < arr[j]) {
                temp = arr[j];
                yeartemp = yeararr[j];
                arr[j] = arr[j + 1];
                yeararr[j]=yeararr[j+1];
                arr[j + 1] = temp;
                yeararr[j+1] = yeartemp;
            }
        }
        }
    }
    public static void main(String[] Args){
            int size;
            int year;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of years: ");
            size=scan.nextInt();
            System.out.print("Enter the starting year: ");
            year=scan.nextInt();


            int[] arr = new int[size];
            int[] yeararr = new int[size];
            for (int i = 0; i< arr.length; i++){
                System.out.print("Enter stat for year "+ year + ": ");
                arr[i]=scan.nextInt();
                yeararr[i]=year;
                year++;
            }
            sort(arr,yeararr);
            for (int i=0; i<arr.length;i++){
                System.out.print(yeararr[i]+"|");
            }

    }
}
