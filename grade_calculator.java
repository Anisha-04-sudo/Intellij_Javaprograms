import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter the marks out of 100: ");
       int Grade = input.nextInt();

       if(Grade>90 && Grade<100){
           System.out.println("A");
       }
       else if(Grade>=80 && Grade<=89){
           System.out.println("B");
       }
       else if(Grade>=70 && Grade<=79){
           System.out.println("C");
       }
       else if(Grade>=60 && Grade<=69){
           System.out.println("D");
       }
       else if(Grade<=60){
           System.out.println("F");
       }
       else{
           System.out.println("Invalid input");
       }
    }
}
