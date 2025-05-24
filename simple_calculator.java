import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1:");
        int num1 = input.nextInt();

        System.out.println("Enter number2: ");
        int num2 = input.nextInt();

        input.nextLine();

        System.out.println("Enter the operation(add,sub,mult,div):");
        String operate = input.nextLine();

        if(operate.equals("add")){
            System.out.println(num1+num2);
        } else if (operate.equals("sub")) {
            System.out.println(num1 - num2);
        } else if (operate.equals("mult")) {
            System.out.println(num1*num2);
        }
        else if(operate.equals("div")){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Invalid operation");
        }

    }
}
