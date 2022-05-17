import java.util.Scanner;

class CreditCard{
    Scanner scan = new Scanner(System.in);
    float bal, points;
    CreditCard(float bal1, float points1){
        bal=bal1;
        points=points1;
    }
void charge(){
        float charge;
    System.out.println("Amount to charge:");
    charge=scan.nextInt();
    bal+=charge;
    points=(float)(points+bal*.01);
}
void payment(){
        float payment;
    System.out.println("Amount to pay: ");
    payment = scan.nextInt();
    bal-=payment;
}
void print(){
    System.out.println("Balance: "+bal);
    System.out.println("Points: "+points);
    }
}
public class Assignment7B {

    public static void main(String[] Args){
        float userInput, bal1=0,points1=0;
        Scanner scan = new Scanner(System.in);
        CreditCard c1= new CreditCard(bal1,points1);
do {
    System.out.println("Would you like to: \n" +
            "1) Charge\n" +
            "2) Make a payment\n" +
            "3) See current balance\n" +
            "4) Quit");
    userInput= scan.nextInt();
    if (userInput==1){
c1.charge();
    }
    else if (userInput==2){
c1.payment();
    }
    else if (userInput==3){
c1.print();
    }
}while(userInput!=4);
    }
}
