package model;

public class students {
    String name;
    double grade;
    int borrowedBooks;

    public students(String name, double grade, int borrowedBooks) {
        this.name = name;
        this.grade = grade;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getborrowedBooks() {
        return borrowedBooks;
    }

    public void setborrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void print_students() {

        System.out.println("The students is "+ this.name +" of class "+this.grade+ " has borrowed " +this.borrowedBooks + " books" );

    }
} 
