import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab10B {
      /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 10B
*/
      public static void main(String[] Args) {
            String userInput;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string: ");
            userInput = scan.nextLine();
            System.out.println(DangDeleter(userInput));
      }

      public static String DangDeleter(String userInput) {
            String DangDeleter;
            DangDeleter= userInput.replace("dang", "&^#@");
            for (int i=0; i<userInput.length();i++){
                  if (DangDeleter.charAt(i)=='&'){
                        System.out.println("Found bad word at: "+i);
                  }
            }
            return DangDeleter;
      }
}


