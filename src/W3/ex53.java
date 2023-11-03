package W3;

import java.util.Scanner;

public class ex53 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ask the user for a word
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        // Ask the user for the length of the first part
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        // Print the first part of the word using the substring method
        System.out.println("Result: " + word.substring(0, length));

        reader.close();
    }
}
