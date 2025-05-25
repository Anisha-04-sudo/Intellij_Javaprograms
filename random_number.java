import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {
        int randInt = (int) (Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number: ");

        while (true) {
            int num = input.nextInt();
            if (num == randInt) {
                System.out.println("hooray! you did it");
                break;
            } else if (num > randInt) {
                System.out.println("Guess smaller");
            } else if (num < randInt) {
                System.out.println("Guess Larger");
            } else {
                System.out.println("out of range!");
            }
        }
    }
}
