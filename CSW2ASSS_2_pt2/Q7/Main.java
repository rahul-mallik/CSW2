package CSW2ASSS_2_pt2.Q7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address{
    int plot_no;
    String at,post;

    public Address(int plot_no, String at, String post) {
        this.plot_no = plot_no;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No. : "+plot_no+", At: "+at+", Post: "+post;
    }
}


public class Main {
    public static void main(String[] args) {
        TreeMap<String,Address> treeMap = new TreeMap<>();

        treeMap.put("Raool",new Address(3241,"BBSR","LANE 3"));
        treeMap.put("Chiru",new Address(3214,"CTC","IDK"));

        Iterator<Map.Entry<String,Address>> iter = treeMap.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String,Address> set = iter.next();
            System.out.println(set);
        }
    }
}
