import java.util.Scanner;

public class dataStreams1_22137233 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        byte number1;
        byte number2;
        float number3;
        String message;

        System.out.println("Please enter a whole number");
        number1 = kb.nextByte();
        kb.nextLine(); 

        System.out.println("Please enter another whole number");
        number2 = kb.nextByte();
        kb.nextLine();

        System.out.println("Please enter a fractional number");
        number3 = kb.nextFloat();
        kb.nextLine(); 

        System.out.println("Please enter a message");
        message = kb.nextLine();

      
        System.out.println("Data entered was:");
        System.out.println("number 1: " + number1);
        System.out.println("number 2: " + number2);
        System.out.println("number 3: " + number3);
        System.out.println("message: " + message);
        
       
       System.out.println("Press Enter to quite this...");
        kb.nextLine();

        kb.close();
    }
}
