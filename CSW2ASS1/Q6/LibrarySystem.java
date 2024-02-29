package CSW2ASS1.Q6;

abstract class LibraryResource{
    private String title,author;

    LibraryResource(String title,String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    void setTitle(String title){
        this.title=title;
    }

    void setAuthor(String author){
        this.author=author;
    }

    abstract void displayDetails();
}

class Book extends LibraryResource{
    private int pageCount;

    Book(String title,String author,int pageCount){
        super(title,author);
        this.pageCount=pageCount;
    }

    @Override
    void displayDetails(){
        System.out.println("Book details:" +
                "\n Title: "+getTitle()+
                "\n Author: "+getAuthor()+
                "\n Page Count: "+pageCount);
    }

    void setPageCount(int setPageCount){
        this.pageCount=pageCount;
    }

    int getPageCount(){
        return pageCount;
    }
}

class Magazine extends LibraryResource{
    private int issueDate;

    Magazine(String title,String author,int issueDate){
        super(title,author);
        this.issueDate=issueDate;
    }

    @Override
    void displayDetails(){
        System.out.println("Magazine details:" +
                "\n Title: "+getTitle()+
                "\n Author: "+getAuthor()+
                "\n Issue Date: "+issueDate);
    }

    void setIssueDate(int issueDate){
        this.issueDate=issueDate;
    }

    int getIssueDate(){
        return issueDate;
    }
}

class DVD extends LibraryResource{
    private double duration;

    DVD(String title,String author,double duration){
        super(title,author);
        this.duration = duration;
    }

    @Override
    void displayDetails(){
        System.out.println("DVD details:" +
                "\n Title: "+getTitle()+
                "\n Author: "+getAuthor()+
                "\n Duration: "+ duration+"minutes");
    }

    void setDuration(double duration){
        this.duration = duration;
    }

    double getDuration(){
        return duration;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Tin Tin","Georges Remi",256);
        Magazine magazine = new Magazine("Forbes","Kevin G. Armstrong",05);
        DVD dvd = new DVD("The Lego Movie","Chris Miller",120);
        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}

/*
    Output
        Book details:
         Title: Tin Tin
         Author: Georges Remi
         Page Count: 256
        Magazine details:
         Title: Forbes
         Author: Kevin G. Armstrong
         Issue Date: 05
        DVD details:
         Title: The Lego Movie
         Author: Chris Miller
         Duration: 120.0minutes
 */