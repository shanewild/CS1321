import java.util.Scanner;

public class Assignment6B {
    public static void main(String[] Args){
        int month,day;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a month: ");
        month= scan.nextInt();
        System.out.print("Enter a day: ");
        day= scan.nextInt();
        System.out.println("It is "+seasons(month,day) +"!");

    }
    public static String seasons(int month, int day) {
        String seasons="";
        switch(month){
            case 1:
            case 2:
                seasons="Winter";
                break;
            case 3:
                if (day<19){
                    seasons="Winter";
                }
                else seasons="Spring";
                break;
            case 4:
            case 5:
                seasons="Spring";
                break;
            case 6:
                if (day<20){
                    seasons="Spring";
                }
                else seasons="Summer";
                break;

            case 7:
            case 8:
                seasons="Summer";
                        break;
            case 9:
                if (day<22){
                    seasons="Fall";
                }
                else  seasons="Summer";
                break;
            case 10:
            case 11:
                seasons="Fall";
                break;
            case 12:
                if (day<21){
                    seasons="Fall";
                }
                else seasons="Winter";
                break;
        }
        return seasons;
    }
}
