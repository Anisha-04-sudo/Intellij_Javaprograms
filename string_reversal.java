import java.util.Scanner;

public class string_reversal {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("The Reversed string is "+ reversed);

    }
}

