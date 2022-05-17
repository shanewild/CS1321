import java.util.Scanner;

public class Lab9B {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 9A
*/
    static int userInput;
 static  Scanner scan = new Scanner(System.in);

    public static void main(String[] Args){


    int[] arr = new int[10];

    while (userInput!=5){
        printMenu(arr);
        userInput= scan.nextInt();
        if (userInput==1){
            enterNum(arr);
        }
        else if(userInput==2){
            printArray(arr);
        }
        else if (userInput==3){
            printSum(arr);
        }
        else if(userInput==4){
            initArray(arr);
        }
    }
    }
    public static void printArray (int[] arr){
for (int i=0; i<10;i++){
    System.out.print("|"+arr[i]);
}
    }
    public static void initArray (int[] arr){
        for(int i=0; i<10;i++){
            arr[i]=0;
        }
    }
    public static void printSum (int[] arr){
        int sum=0;
        for (int i=0;i<10;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void enterNum(int[] arr){
        int slot;
        int value;
        System.out.print("Enter the slot: ");
        slot = scan.nextInt();
        System.out.print("Enter the new value: ");
        value=scan.nextInt();
        arr[slot]= value;

    }
    public static void printMenu (int[] arr){
        System.out.println("Would you like to: \n1) Enter a number\n" + "2) Print the array\n" + "3) Find the sum of the array\n" + "4) Reset the array\n" + "5) Quit");
    }
}