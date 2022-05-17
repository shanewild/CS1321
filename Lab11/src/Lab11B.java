

class Turtle{

    int speed;
    String color;
    Turtle(){
        speed=0;
        color="green";
    }
    Turtle(int s, String c){
        speed = s;
        color = c;
    }
    void speed(){
        System.out.println(speed);

    }
    void color(){
        System.out.println(color);
    }
}
public class Lab11B {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 11B

*/
    public static void main(String[] Args){
        int s=5;
        String c="purple";

Turtle t1= new Turtle();
Turtle t2= new Turtle(s,c);
t1.speed();
t2.color();
    }
}
