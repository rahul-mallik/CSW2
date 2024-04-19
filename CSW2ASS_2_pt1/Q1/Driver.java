package CSW2ASS_2_pt1.Q1;

class Student<T> {
    String name;
    T roll_no;
    int age;

    Student(String name,T roll_no,int age){
        this.name=name;
        this.roll_no=roll_no;
        this.age=age;
    }

    public String toString(){
        return "Name: "+name+"\nRoll Number: "+roll_no+"\nAge: "+age;
    }

}

public class Driver{
    public static void main(String[] args) {
        Student<Integer> s1 = new Student("Rahul",224101,20);
        Student<String> s2 = new Student("Swabhiman","2241013086",25);
        System.out.println(s1+"\n"+s2);
    }
}
