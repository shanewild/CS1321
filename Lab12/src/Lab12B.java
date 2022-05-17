class Stock {
    String name, symbol;
    float previous, value;
    int percent;

    Stock(String n, String s) {
        name=n;
        symbol=s;
        previous=0;
        value=0;
    }
     String getName(){
        return name;
    }
     String getSymbol(){
        return symbol;
    }
     void setClosingPrice(float p){
        previous=p;
    }
     void setCurrentPrice(float v){
        value=v;
    }

    void setChangePercent(){

        percent= Math.round((value-previous)/value*100);
    }
    void print(){
        System.out.println(getName()+" stock");
        System.out.println("\tSymbol: "+symbol);
        System.out.println("\tClosing price: "+previous);
        System.out.println("\tCurrent price: "+value);
        System.out.println("\tChange percent: "+percent+"%");
    }

}

public class Lab12B {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 12B

*/

        public static void main(String[] Args) {
            Stock s1 = new Stock("Google", "GOG");
            Stock s2 = new Stock("Microsoft", "MSF");
            s1.setClosingPrice(134.67f);
            s1.setCurrentPrice(131.98f);
            s1.setChangePercent();
            s2.setClosingPrice(156.52f);
            s2.setCurrentPrice(161.22f);
            s2.setChangePercent();
            s1.print();
            s2.print();

        }
    }
