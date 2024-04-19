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
