import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab10A {
      /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 10A

*/
      static Scanner scan = new Scanner(System.in);
      static String userInput;
      public static void main(String[] Args) {
          System.out.println("Enter a string: ");
          userInput = scan.nextLine();
          System.out.println("That string has "+ReplaceVowels(userInput)+" vowels.");
      }
    public static int ReplaceVowels(String userInput){
        int vowels=0;
       userInput=userInput.replace("a","*");
       userInput=userInput.replace("e","*");
        userInput=userInput.replace("i","*");
        userInput=userInput.replace("o","*");
        userInput=userInput.replace("u","*");
        for (int i=0; i<userInput.length();i++){
            if (userInput.charAt(i)=='*') {
            vowels++;
            }
        }
        System.out.println(userInput);
        return vowels;
    }

}
