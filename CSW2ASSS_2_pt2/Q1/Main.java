package CSW2ASSS_2_pt2.Q1;

class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Pair<Character, Integer> p1 = new Pair<>('A',12);
        Pair<String, Integer> p2 = new Pair<>("CD",51);

        System.out.println("PAIR 1 has Key: "+p1.getKey()+" and Value: "+p1.getValue());
        System.out.println("PAIR 2 has Key: "+p2.getKey()+" and Value: "+p2.getValue());
    }
}
