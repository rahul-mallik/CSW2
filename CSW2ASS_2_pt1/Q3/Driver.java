package CSW2ASS_2_pt1.Q3;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("CIVIC", "White", 120.25);
        Car c2 = new Car("SUPRA", "Red", 340.25);

        if (c1.compareTo(c2)>0){
            System.out.println("This car has more speed.\n"+c1);
        } else if (c1.compareTo(c2)==0) {
            System.out.println("Both the cars have same Speed.\n"+c1+"\n"+c2);
        }else {
            System.out.println("This car has more speed.\n"+c2);
        }
    }
}

class Car implements Comparable<Car>{
    String model,color;
    double speed;

    Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.speed,o.speed);
    }

    @Override
    public String toString() {
        return "Car Details: \n"+"Model: "+model+"\nColor: "+color+"\nSpeed: "+speed;
    }
}
