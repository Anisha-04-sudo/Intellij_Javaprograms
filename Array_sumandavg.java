import java.util.Scanner;

public class Array_sumandavg {
    public static void main(String[] args) {
         int sum =0;
         int avg;
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of elements: ");
        int n = input.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
           nums[i] = input.nextInt();
         }
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        System.out.println("sum is "+ sum);
        System.out.println("avg is "+ sum/n);
    }
}

