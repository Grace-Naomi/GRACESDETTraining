package JirTasks;

import java.util.Scanner;

public class StringPalindrome {


        public static void main(String args[])
        {
            String original_string, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a string to check if it is a palindrome");
            original_string = in.nextLine();
            int length = original_string.length();

            for ( int i = length - 1; i >= 0; i-- ) {
                reverse = reverse + original_string.charAt(i);
            }

                if (original_string.equals(reverse)) {
                    System.out.println("String is a palindrome.");
                }
                else {
                    System.out.println("String is not a palindrome.");
                }

        }
}
