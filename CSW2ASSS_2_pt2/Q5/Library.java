package CSW2ASSS_2_pt2.Q5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Book {
    String name,author;
    int id, quantity;

    public Book(String name, String author, int id, int quantity) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAuthor: "+author+"\nId: "+id+"\nQuantity: "+quantity+"\n";
    }
}

public class Library {
    public static void main(String[] args) {
        HashMap<Integer,Book> map = new HashMap<>();
        map.put(1,new Book("Hum aapke hai kon","Donald Trump",224101,53));
        map.put(2,new Book("Kahani ghar ghar ki", "Modi Ji",234151,69));

        System.out.println("The HashMap Contains the list of books: \n"+map);

        System.out.println("Enter the name of the book: ");
        Scanner in=new Scanner(System.in);
        String name = in.nextLine();
        boolean found = false;

        for (Map.Entry<Integer, Book> set : map.entrySet()) {
            if(set.getValue().name.equals(name)){
                System.out.println("Yes the HashMap contains the book.\n"+set);
                found = true;
            }
        }

        if(!found){
            System.out.println("Book does not exists in the collection.");
        }

        /* Same thing But using iterator
                Iterator<Map.Entry<Integer,Book>> iter = map.entrySet().iterator();

                while(iter.hasNext()){
                    Map.Entry<Integer,Book> set = iter.next();
                    if(set.getValue().name.equals(name)){
                        System.out.println("Yes the HashMap contains the book.\n"+set);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Book does not exists in the collection.");
                }
         */

        map.remove(1);
        System.out.println("Updated Collection\n"+map);


    }
}
