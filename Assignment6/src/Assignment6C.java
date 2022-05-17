import java.util.Scanner;

public class Assignment6C {
    public static void main(String [] Args){
        String userInput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        userInput=scan.nextLine();
        System.out.println(leetspeak(userInput));

    }
    public static String leetspeak(String userinput){
       userinput=userinput.replace('a','4');
        userinput= userinput.replace('b','B');
        userinput= userinput.replace('c','(');
        userinput= userinput.replace('d','D');
        userinput= userinput.replace('e','3');
        userinput=  userinput.replace("f","Ph");
        userinput= userinput.replace('g','9');
        userinput=  userinput.replace("h","|-|");
        userinput=  userinput.replace('i','1');
        userinput=  userinput.replace('j','j');
        userinput=  userinput.replace("k","|<");
        userinput=  userinput.replace('l','L');
        userinput=  userinput.replace("m","/\\\\/\\\\");
        userinput=  userinput.replace("n","|\\\\|");
        userinput=  userinput.replace('o','0');
        userinput=  userinput.replace('p','P');
        userinput=  userinput.replace('q','Q');
        userinput=  userinput.replace('r','R');
        userinput=  userinput.replace('s','$');
        userinput=  userinput.replace('t','7');
        userinput=  userinput.replace('u','U');
        userinput=  userinput.replace("v","\\\\/");
        userinput=   userinput.replace("x","><");
        userinput=  userinput.replace("w","\\\\/\\\\/");
        userinput=  userinput.replace("v","\\\\/");
        userinput=  userinput.replace("y","'/");
        userinput=   userinput.replace('z','Z');
        return userinput;
    }
}
