package CSW2ASS1.Q8;
interface Vehicle {
    void accelerate();
    void brake();
}

class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

    public void accelerate(double speed, int duration) {
        System.out.println("Car is accelerating at " + speed + " km/h for " + duration + " seconds.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is pedaling faster...");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is applying brakes...");
    }

    public void accelerate(int pedalCadence) {
        System.out.println("Bicycle is pedaling at " + pedalCadence + " RPM.");
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        myCar.accelerate();
        myCar.brake();

        myBicycle.accelerate();
        myBicycle.brake();

        myCar.accelerate(80.0, 10);
        myBicycle.accelerate(60);

    }
}
/*
    output
        Car is accelerating...
        Car is braking...
        Bicycle is pedaling faster...
        Bicycle is applying brakes...
        Car is accelerating at 80.0 km/h for 10 seconds.
        Bicycle is pedaling at 60 RPM.
 */
