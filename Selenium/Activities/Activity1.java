import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args){

        Car bmw = new Car ();
        Scanner sc = new Scanner(System.in);
        bmw.make = 2014;
        System.out.println("Please Choose a color for your car: ");
        bmw.color = sc.next();
        System.out.println("Which Transmission would you ike to buy: ");
        bmw.transmission = sc.next();

        bmw.displayCharacteristics();
        bmw.accelerate();
        bmw.brake();
    }

}
