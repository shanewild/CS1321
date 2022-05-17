import javax.naming.Name;

/* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 12A

*/
class LightBulb{
    private boolean on;
    private int watthours=0;
    private int watts;
    private String name;

    LightBulb(){
        on=false;
        watts=0;
        name="0";
    }
    LightBulb(int w, boolean o, String n){
        watts=w;
        on=o;
        name=n;

    }


    void swap(){
        on= !on;
    }
    void incrementTime(int hours){
        if (on){
            watthours+=watts*hours;
        }
    }
    void print(){
        String truefalse;
        if (on){
            truefalse="on";
        }
        else{
            truefalse="off";
        }
        System.out.println("Bulb " + this.name+ " is " +truefalse+" and has used "+watthours+" watt-hours.");
    }

}
public class Lab12A {


    public static void main(String[] Args){
    int w=100;
    boolean o=false;
    String n="1";
    LightBulb l1=new LightBulb();
    LightBulb l2=new LightBulb(w,o,n);
    l1.print();
    l2.print();
    l2.swap();
    l1.incrementTime(5);
    l2.incrementTime(5);
    l1.print();
    l2.print();
    }
}
