package CSW2ASS1.Q4;

class Laptop{
    private String model;
    private double price;

    void setModel(String model){
        this.model=model;
    }

    void setPrice(double price){
        this.price=price;
    }

    @Override
    public String toString(){
        return "Model: "+model+" Price: "+price;
    }



}

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setModel("HP pavilion 15");
        l1.setPrice(62000);

        System.out.println("Details of laptop1: "+l1.toString());

        // functionality of .toString() in this code is to return the value of Model and price
        //of the individual laptop objects.. and this function is overriding the function from the
        //object class as every in java is a child class of object class i.e every class extends Object class
    }
}

/*
    Output
        Details of laptop1: Model: HP pavilion 15 Price: 62000.0
 */
