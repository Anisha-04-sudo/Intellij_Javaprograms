import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        long result =1;

        if(num<0){
            System.out.println("Number is negative(invalid)");
        }
        else{
            for(int i=1;i<=num;i++){
                result =result*i;
            }
            System.out.println("The Factorial of the number is "+ result);
        }
    }
}
