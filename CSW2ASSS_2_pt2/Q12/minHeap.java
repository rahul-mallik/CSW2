package CSW2ASSS_2_pt2.Q12;

import java.util.PriorityQueue;

public class minHeap {
    public static void main(String[] args) {
        int[] arr = {1,2,10,8,7,3,4,6,5,9};

        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int a :arr) {
            min.add(a);
        }
        while(!min.isEmpty()){
            System.out.print(min.poll()+" ");
        }
    }
}
