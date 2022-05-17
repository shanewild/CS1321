import java.util.Scanner;

public class Lab10C {
      /* Class: CSE 1321L
        Section: 05
        Term: Fall
        Instructor: Vishal
        Name: Shane Wild
        Lab#: 10C
*/
   Scanner scan = new Scanner(System.in);
   String userInput;
      public static void main(String[]Args){
            char temp;
            int asciiValue;
            Scanner scan = new Scanner(System.in);
            String userInput;
                  System.out.print("Enter a string: ");
                  userInput = scan.nextLine();
            for (int i=0; i<userInput.length();i++){
                  temp=userInput.charAt(i);
                  asciiValue =temp;
                  if (asciiValue>96 && asciiValue<123) {
                        asciiValue = (asciiValue + 13);
                        if (asciiValue>122){
                              asciiValue= asciiValue-26;
                        }
                        temp = (char) asciiValue;
                        //userInput = userInput.replace(userInput.charAt(i), temp);
                        userInput= userInput.substring(0,i)+temp+userInput.substring(i+1);
                  }
                  }
            System.out.println(userInput);
      }

}
