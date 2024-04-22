package CSW2ASSS_2_pt2.Q6;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(5);
        set.add(127);
        set.add(45);
        set.add(0);
        set.add(562);

        System.out.println("Tree set: "+set);
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();

        if (set.contains(num))
            System.out.println(num+" is in the TreeSet.");
        else
            System.out.println(num+" is not in the TreeSet.");

        set.remove(12);
        System.out.println("Updated TreeSet: "+set);
    }
}
