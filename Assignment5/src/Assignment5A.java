import java.util.Scanner;

public class Assignment5A {

    public static void main(String[] Args){
        int min =1000;
        int max =0;
int size;
int year;
int baseyear;
int minyear=0;
int maxyear=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        size=scan.nextInt();
        System.out.print("Enter the starting year: ");
        year=scan.nextInt();
        baseyear=year;

        int[] arr = new int[size];
for (int i = 0; i< arr.length; i++){
    System.out.print("Enter stat for year "+ year + ": ");
    arr[i]=scan.nextInt();
    year++;
}

for (int j=0; j< arr.length; j++){
    if (min>arr[j]){
        min= arr[j];
        minyear=j;
    }
    if (max<arr[j]){
        max=arr[j];
        maxyear =j;
    }

}
maxyear += baseyear;
minyear += baseyear;
        System.out.println("Best stat was "+max+" in year " +maxyear);
        System.out.println("Worst stat was "+min+" in year " +minyear);
    }
}
