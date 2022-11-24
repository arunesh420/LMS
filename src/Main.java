import model.books;
import model.borrows;
import model.students;

public class Main {
    public static void main(String[] args) {


        students std1=new students("Arunesh",12,6);
        students std2=new students("Jayj",11,8);

        std1.print_students();

        books bk1=new books("Eklavya","Roshan Sharma",12123,2017);
        books bk2=new books("A Wrinkle In Time","Murakami",17628,2012);
        bk1.print_books();


        borrows Bk1=new borrows(01,23011,2,80);
        borrows Bk2=new borrows(02,23034,1,40);

        Bk2.finerates();


    }
}
