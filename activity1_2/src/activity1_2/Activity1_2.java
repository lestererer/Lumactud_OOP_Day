
package activity1_2;

import java.util.Scanner;

public class Activity1_2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String phrase = scanner.nextLine();

        boolean allLowercase = true;

        // Iterate over each word in the phrase
        for (String word : phrase.split("\\s+")) {
            // Check if any character in the word is uppercase except the first letter
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    allLowercase = false;
                    break; // No need to check further characters once a capital is found
                }
            }
        }

        if (allLowercase == true) {
            System.out.println("uWu");
        } else {
            System.out.println("JEJE!");
        }
    }
}