import java.util.Scanner;

public class Assignment4B {  public static void main(String[] Args){
    int size;
    int x=0;
    int y=0;
    int current;
    String result ="";
    String indent ="";
    Scanner scan = new Scanner(System.in);
    System.out.println("Size: ");
    size = scan.nextInt();
    current = size+1;
    while(y<size) {
        x=0;
        if (y!=0){
            System.out.print("\n");
            indent += "  ";
        }
        y++;
        System.out.print(indent);
        current--;


        while(x<current){
            if (y==size && x==current-1){
                System.out.print(x);
            }
            else{
                System.out.print(x + " ");
            }
            x++;


        }
    }
}
}
