import java.util.Scanner;

public class Activity3 {
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the seconds you lived on till now: ");
            double seconds = sc.nextInt();
    
            double Seconds_on_earth = 31557600;
            double Seconds_on_mercury = 0.2408467;
            double Seconds_on_venus = 0.61519726;
            double Seconds_on_Mars = 1.8808158;
            double Seconds_on_jupiter = 11.862615;
            double Seconds_on_Saturn = 29.447498;
            double Seconds_on_Uranus = 84.016846;
            double Seconds_on_Neptune = 164.79132;
            
            System.out.println("Age on Mercury: " + seconds / Seconds_on_earth / Seconds_on_mercury);
            System.out.println("Age on Venus: " + seconds / Seconds_on_earth / Seconds_on_venus);
            System.out.println("Age on Earth: " + seconds / Seconds_on_earth);
            System.out.println("Age on Mars: " + seconds / Seconds_on_earth / Seconds_on_Mars);
            System.out.println("Age on Jupiter: " + seconds / Seconds_on_earth / Seconds_on_jupiter);
            System.out.println("Age on Saturn: " + seconds / Seconds_on_earth / Seconds_on_Saturn);
            System.out.println("Age on Uranus: " + seconds / Seconds_on_earth / Seconds_on_Uranus);
            System.out.println("Age on Neptune: " + seconds / Seconds_on_earth / Seconds_on_Neptune);
        }
    
}
