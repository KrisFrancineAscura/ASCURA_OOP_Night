
package ascura_oop_night;

import java.util.Scanner;

public class ASCURA_OOP_NIGHT {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message: ");
        String message = scanner.nextLine();

        if (checkCapital(message)) {
            System.out.println("uWu");
        } else {
            System.out.println("JEJE!");
        }
    }

    private static boolean checkCapital(String message) {
        
        if (Character.isUpperCase(message.charAt(0))) {
            for (int i = 1; i < message.length(); i++) {
                char currentChar = message.charAt(i);

               
                if (Character.isUpperCase(currentChar) && message.charAt(i - 1) != ' ') {
                    return false;
                }
            }
            return true; 
        }
        return false; 
    }
}
