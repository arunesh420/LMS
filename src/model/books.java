package model;

public class books {
    String bookName;
    String author;
    double ISBN;
    double time;

    public books(String bookName, String author, double ISBN, double time) {
        this.bookName = bookName;
        this.author = author;
        this.ISBN = ISBN;
        this.time = time;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double ISBN) {
        this.ISBN = ISBN;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void print_books(){

        System.out.println("Name: "+ this.bookName);
        System.out.println("Author: "+ this.author);
        System.out.println("ISBM :"+this.ISBN);
        System.out.println("Published Year :"+this.time);
    }
}
