Q1. Write a program to create a Student class that has members, name, roll number, and age. Design the Student class in such a way that it can take the roll number as an integer or string. Create a driver class that creates student objects and invokes the methods.

```
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
```


Q2. Write a program to create a Book class with member variables bookId, bookName, and price. Add the respective method and constructor to it. Create a driver class in that class and create two book objects. Compare the book objects according to their price. Print the details of the book objects. Note: *Overload toString and equals method*
```
package CSW2ASS_2_pt1.Q2;

public class Driver {
    public static void main(String[] args) {
        Book b1 = new Book(224, "Haunting Adelin", 240.15);
        Book b2 = new Book(1124,"Harry Potter", 450.54);

        System.out.println(b1+"\n"+b2);

        System.out.println("Are the price Equal: "+ b1.equals(b2));
    }
}

class Book{
    int bookId;
    String bookName;
    double price;

    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book Details: \nID: "+bookId+"\nName: "+bookName+"\nPrice: "+price+"\n";
    }

    public boolean equals(Book book){
        return this.price==book.price;
    }
}
```

Q3. Write a program to create a Car class with member variables model, color, and speed. Add the respective method and constructor to it. Create a driver class in that class and create two car objects. Compare the car objects according to their speed and print the details of the car that has a greater speed. Note: *Overload compareTo method of Comparable interface.*
```
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
```

Q4. Write a program to create a Student class with members name, rn, and totalMark. Create an array of student objects and search a student object using linear search from the array.*Note: Overload compareTo method of Comparable interface.*
```
package CSW2ASS_2_pt1.Q4;

public class Student implements Comparable<Student> {
    String name;
    int rn;
    double totalMark;

    public Student(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n name= " + name +
                "\n rn= " + rn +
                "\n totalMark=" + totalMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rn,o.rn);
    }

    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        s1[0] = new Student("Raool",224151,45);
        s1[1] = new Student("omaan", 545214, 67);
        s1[2] =  new Student("moana",45781,99);

        // this student obj is to be searched from the array
        Student search = new Student("Raool",224151,45);
        boolean found = false;
        for (Student s: s1) {
            if(search.compareTo(s)==0){
                System.out.println("The Student is found and the details are: \n"+s);
                found = true;
            }
        }

        if(!found){
            System.out.println("The Student is not found in the array.");
        }
    }
}
```

Q5. Write a program to create a Student class with members name, rn, and total mark. Create an array of student objects and sort it using Bubble sort according to its rn. *Note: Overload compareTo method of Comparable interface.*
```
package CSW2ASS_2_pt1.Q5;

public class Student implements Comparable<Student> {
    String name;
    int rn;
    double totalMark;

    public Student(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n name= " + name +
                "\n rn= " + rn +
                "\n totalMark=" + totalMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rn,o.rn);
    }

    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        s1[0] = new Student("Raool", 224151, 45);
        s1[1] = new Student("omaan", 545214, 67);
        s1[2] = new Student("moana", 45781, 99);

        for (int i = 0; i < s1.length; i++) {
            for (int j = 1; j < s1.length-i; j++) {
                if (s1[j-1].compareTo(s1[j])>0){
                    Student temp = s1[j-1];
                    s1[j-1] = s1[j];
                    s1[j] = temp;
                }
            }
        }

        for (Student s:s1) {
            System.out.println(s+"\n");
        }
    }
}
```

Q6. Write a program to create an Animal class with member variables name, color, types (pet/wild). Override the hashCode method to print the unique id for the object. Create the objects of the Animal class and print its hashcode.
```
package CSW2ASS_2_pt1.Q6;

public class Animal {
    String name,color,type;

    Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+color.hashCode()+type.hashCode()/2;
    }

    public static void main(String[] args) {
        Animal a1 =  new Animal("Dog","White","pet");
        Animal a2 = new Animal("Tiger","Yellow-Orange","Wild");

        System.out.println("Hash Code of animal 1: "+a1.hashCode());
        System.out.println("Hash Code of animal 2: "+a2.hashCode());
    }
}
```
