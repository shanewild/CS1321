import java.util.Scanner;

public class Lab7B {
    public static void main(String[] Args) {
         /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 7B
*/
        Scanner scan = new Scanner(System.in);
        int number;
        double GPA;
        System.out.print("Enter the number of GPAs: ");
        number = scan.nextInt();
        double[] myArray = new double[number];
        for (int i = 0; i< myArray.length; i++){
            System.out.print("GPA #"+ i +": ");
            GPA = scan.nextDouble();
            myArray[i]=  GPA;
        }
        for (int i=0;i<myArray.length; i++){
            if (myArray[i]<2){
                System.out.println("Student #"+i+":"+" Not graduating");
            }
            if (myArray[i]>=2 && myArray[i]<3.5) {
                System.out.println("Student #" + i +":"+ " Graduating");
            }
            if (myArray[i]>=3.5 && myArray[i]<3.7){
                System.out.println("Student #" + i +":"+ " Cum Laude");
            }
            if (myArray[i]>=3.7 && myArray[i]<3.9) {
                System.out.println("Student #" + i +":"+ " Magna Cum Laude" );
            }
            if(myArray[i]>=3.9){
                System.out.println("Student #" + i +":"+ " Summa Cum Laude");
            }
            }
         }
        }




