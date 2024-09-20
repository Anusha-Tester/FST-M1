interface BicycleParts {
    public int gears = 0;
    public int SpeedNow = 0;
}

interface BicycleOperations {
    public void brake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int SpeedNow;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.SpeedNow = currentSpeed;
    }

    public void brake(int decrement) {
        SpeedNow -= decrement;
        System.out.println("Speed Currently: " + SpeedNow);
    }

    public void speedUp(int increment) {
        SpeedNow += increment;
        System.out.println("Speed Currently: " + SpeedNow);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + SpeedNow);
    }
}

class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight) {

        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.brake(5);
    }
}
