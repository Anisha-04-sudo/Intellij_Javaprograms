import java.util.Scanner;

public class method_overloading {

    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {

        method_overloading calc = new method_overloading();

        System.out.println(calc.add(10,20));
        System.out.println(calc.add(10,20,30));
        System.out.println(calc.add(10.76,90.80));
    }
}
