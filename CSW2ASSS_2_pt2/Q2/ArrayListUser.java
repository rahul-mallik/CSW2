package CSW2ASSS_2_pt2.Q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class User implements Comparable<User>{

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age,o.age);
    }
}

public class ArrayListUser {
    ArrayList<User> users;

    ArrayListUser(){
        users = new ArrayList<>();
    }

    void sortArrayList(){
        Collections.sort(users);
    }

    void add(User newUser){
        users.add(newUser);
    }

    void printArray(){
        for (User user:users) {
            System.out.println( "User Details: \nName: "+user.getName()+"\nAge: "+user.getAge());
        }
    }

    public static void main(String[] args) {
        ArrayListUser list = new ArrayListUser();
        list.add(new User("Raool",20));
        list.add(new User("chiru", 19));
        list.add(new User("utkarsh",21));

        list.sortArrayList();

        list.printArray();
    }

    /*
    Easier code
        // no need of creating all the other methods like i did in the above code

    psvm{
        ArrayList<User> u = new ArrayList<>();

        u.add(.....);
        u.add(.....);
        u.add(.....);

        Collections.sort(u);

        for each loop and print all the values

    }
     */
}
