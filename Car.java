import java.util.Scanner;

// latestCar.java
public class Car {
    static class latestCar {  // no `public`
        String Make;
        String Model;
        int Year;

        void displayDetails() {
            System.out.println(Make);
            System.out.println(Model);
            System.out.println(Year);
        }
    }

    public static void main(String[] args) {
        latestCar mycar = new latestCar();

        mycar.Make = "Classy";
        mycar.Model = "Toyota";
        mycar.Year = 2022;

        mycar.displayDetails();
    }
}




