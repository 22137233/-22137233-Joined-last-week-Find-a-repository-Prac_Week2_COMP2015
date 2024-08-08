import java.util.Scanner;

public class dataStreams2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        byte number1;
        byte number2;
        float number3;
        String message;

        // Prompt and read the first byte value
        System.out.println("Please enter a whole number:");
        number1 = kb.nextByte();
       // kb.nextLine(); // Consume the leftover newline character

        // Prompt and read the message
        System.out.println("Please enter a message:");
        message = kb.nextLine();

        // Prompt and read the second byte value
        System.out.println("Please enter another whole number:");
        number2 = kb.nextByte();
        //kb.nextLine(); // Consume the leftover newline character

        // Prompt and read the float value
        System.out.println("Please enter a fractional number:");
        number3 = kb.nextFloat();
     //   kb.nextLine(); // Consume the leftover newline character

        // Output the results
        System.out.println("Data entered was:");
        System.out.println("number 1: " + number1);
        System.out.println("message: " + message);
        System.out.println("number 2: " + number2);
        System.out.println("number 3: " + number3);

    }
}
