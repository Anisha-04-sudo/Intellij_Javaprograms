import java.util.Scanner;

public class try_catch {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
             try{
                 System.out.println("Enter a number: ");
                 int numerator = input.nextInt();

                 System.out.println("Enter sec number: ");
                 int denominator = input.nextInt();

                 int result = numerator/denominator;
                 System.out.println("Result is " + result);
             }catch (ArithmeticException e){
                System.out.println("Error: Denominator as zero is not allowed");
            }
             catch(Exception e){
                System.out.println("Error:Invalid input");
            }
            System.out.println("Program continues without any try - catch");
        }

    }

