package CSW2ASSS_2_pt2.Q4;

import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;
        return age==student.age && name.equals(student.name) && mark==student.mark;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Age: "+age+", Mark: "+mark;
    }


    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();

        list.add(new Student("raool",20,97.56));
        list.add(new Student("chiru",19,89.78));
        list.add(new Student("utkarsh",21,69.69));
        list.add(new Student("liti",20,100));

        System.out.println("List contents:");
        for (Student s:list) {
            System.out.println(s);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = in.nextLine();
        System.out.println("Enter the Age:");
        int age = in.nextInt();
        System.out.println("Enter Marks: ");
        double marks = in.nextDouble();

        Student search = new Student(name,age,marks);
        if (list.contains(search))
            System.out.println("The LinkedList have the student element in it");
        else
            System.out.println("The Student Object is not in the LinkedList");


        list.remove(search);
        System.out.println("Student object removed");

        System.out.println("The Updated List contents:");
        for (Student s:list) {
            System.out.println(s);
        }

        System.out.println("Number of objects in the lsit: "+list.size());
    }
}
