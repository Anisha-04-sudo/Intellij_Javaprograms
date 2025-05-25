import java.util.Scanner;

public class fibonacci {
    public static int fibo(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
         int num = input.nextInt();


         for(int i=0;i<num;i++){
             System.out.print(fibo(i)+" ");
         }


    }
}
