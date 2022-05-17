import java.util.Scanner;

public class Assignment8A {
    private static void matrix(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            if(i!=0){
            System.out.println();
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"\t");

            }
        }
        System.out.println();

    }
    private static void convert(int[][] arr, int[] arr1d){
        int a=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr1d[a]=arr[i][j];
                a++;
            }
        }
    }
    private static void bubbleSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    private static void compare(int[] arrd1, int[]arrd2){
        String arr1="", arr2="";
        boolean equivalent=true;
        for (int i=0; i<9; i++){
            arr1+="|"+arrd1[i];
            arr2+="|"+arrd2[i];
            if(arrd1[i]!=arrd2[i]){
                equivalent=false;
            }


        }
        System.out.println(arr1+"|");
        System.out.println(arr2+"|");
        if (equivalent){
            System.out.println("Arrays are equivalent.");
        }
        else{
            System.out.println("Arrays are not equivalent.");
        }
    }
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);
        int[][] arr1=new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Array 1 slot ("+i+","+j+"):");
                arr1[i][j]=scan.nextInt();

            }

        }
        matrix(arr1);
        int[][] arr2=new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Array 2 slot ("+i+","+j+"):");
                arr2[i][j]=scan.nextInt();

            }
        }
        matrix(arr2);
        int[] arr1d1=new int[9];
        int[] arr1d2=new int[9];
        convert(arr1,arr1d1);
        convert(arr2,arr1d2);
        bubbleSort(arr1d1);
        bubbleSort(arr1d2);
        compare(arr1d1,arr1d2);


    }
}
