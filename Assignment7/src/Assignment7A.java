import java.util.Scanner;

class Ball{
    int xvel, x, y, yvel;
    Ball(int xvel1, int x1, int y1,int  yvel1){
        xvel=xvel1;
        x=x1;
        y=y1;
        yvel=yvel1;

  }
  void print(){
      System.out.println("X: "+x+" Y: " + y);
  }
   void move(){
      if (x==9&&xvel==1){
          xvel=-1;
      }
       if (x==0&&xvel==-1){
           xvel=1;
       }
      if (y==9&&yvel==1){
          yvel=-1;
      }
       if (y==0&&yvel==-1){
           yvel=1;
       }

      x+=xvel;
      y+=yvel;

    }
}
public class Assignment7A {
    public static void main(String[] Args) {
        int xvel1, x1, y1, yvel1, moves;
        System.out.println("x:");
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextInt();
        System.out.println("y:");
        y1 = scan.nextInt();
        System.out.println("x velocity:");
        xvel1 = scan.nextInt();
        System.out.println("y velocity:");
        yvel1 = scan.nextInt();
        System.out.println("Number of moves: ");
        moves = scan.nextInt();
        Ball b1= new Ball(xvel1,x1,y1,yvel1);
        b1.print();
        for (int i = 0; i < moves; i++) {
b1.move();
b1.print();
        }
    }
}
