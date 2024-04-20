package CSW2ASSS_2_pt2.Q3;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
    private int ModalNo, stock;
    private String name;

    public Car(int modalNo, String name, int stock) {
        ModalNo = modalNo;
        this.stock = stock;
        this.name = name;
    }

    public int getModalNo() {
        return ModalNo;
    }

    public void setModalNo(int modalNo) {
        ModalNo = modalNo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.stock,o.stock);
    }
}
public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car(2013 ,"Creta", 10));
        list.add(new Car(2020 ,"MG", 13));
        list.add(new Car(2018 ,"Kia", 20));
        list.add(new Car(2017 ,"Audi", 45));
        list.add(new Car(2015,"BMW",55));

        Collections.sort(list);

        System.out.println("Sorted list as per stocks: ");

        for (Car c :list) {
            System.out.println("Modal Number: "+c.getModalNo()+", Name: "+c.getName()+", Stocks: "+c.getStock());
        }
    }
}
