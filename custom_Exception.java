import java.util.Scanner;

class AgeTooSmallException extends Exception {
    public AgeTooSmallException(String message) {
        super(message);
    }
}
public class custom_Exception {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the age: ");
            int age = input.nextInt();

            try {
                checkAge(age);
                System.out.println("Age accepted");
            } catch (AgeTooSmallException e) {
                System.out.println("Custom exception caught: " + e.getMessage());
            }
        }

    // Method to check age
    static void checkAge(int age) throws AgeTooSmallException {
        if (age < 18) {
            throw new AgeTooSmallException("Age must be 18 or above");
        }
        }

    }

