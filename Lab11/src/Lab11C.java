class KoalaBear{
    float weight =100.0f;
    void eat(int leaves){
     float eat;
        eat=leaves*.001f;
    weight+=eat;
        System.out.println("This koala weighs "+ weight+" kilos");
    }
}
public class Lab11C {
    /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 11C

*/
    public static void main(String[] Args){
        KoalaBear k1 = new KoalaBear();
        k1.eat(400);
        k1.eat(300);
        k1.eat(650);

    }
}
