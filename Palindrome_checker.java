import java.util.Scanner;

public class Palindrome_checker {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();

        String cleaned = word.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println("The Reversed string is "+ reversed);

        if(cleaned.equals(reversed)){
            System.out.println("The word is Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}

