package CSW2ASS1.Q1;

class Car{
    private String make, model;

    Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    void setMake(String make){
        this.make=make;
    }

    void setModel(String model){
        this.model=model;
    }

    String getMake(){
        return make;
    }

    String getModel(){
        return model;
    }
}

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("BMW","5 Series");
        Car myCar2 = new Car(null,null);

        System.out.println("Details of Car1:" +
                "\n Make: " +myCar1.getMake()+
                "\n Model: "+myCar1.getModel());

        System.out.println("Details of Car2:" +
                "\n Make: " +myCar2.getMake()+
                "\n Model: "+myCar2.getModel());

        myCar2.setMake("Porsche");
        myCar2.setModel("911 GT3");

        System.out.println("Details of Car2:" +
                "\n Make: " +myCar2.getMake()+
                "\n Model: "+myCar2.getModel());

    }
}

/*
    output:
        Details of Car1:
         Make: BMW
         Model: 5 Series
        Details of Car2:
         Make: null
         Model: null
        Details of Car2:
         Make: Porsche
         Model: 911 GT3
 */
