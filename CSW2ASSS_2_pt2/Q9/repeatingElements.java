package CSW2ASSS_2_pt2.Q9;

import java.util.HashSet;

public class repeatingElements {
    public static void main(String[] args) {
        int[] array = {4,3,2,1,5,4,5,1,2,9,10};
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Repeating Elements are: ");
        for (int a :array) {
            if(set.contains(a))
                System.out.print(a+" ");
            else set.add(a);
        }
    }
}
