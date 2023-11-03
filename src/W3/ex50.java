package W3;

import java.util.Scanner;

public class ex50 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Type your name: ");
        String userName = reader.nextLine();

        // Check if the name length is at least three characters
        if (userName.length() >= 3) {
            // Print the first three characters separately
            System.out.println("1. character: " + userName.charAt(0));
            System.out.println("2. character: " + userName.charAt(1));
            System.out.println("3. character: " + userName.charAt(2));
        }
        // If the name is shorter than three characters, do nothing

        reader.close();
    }
}
