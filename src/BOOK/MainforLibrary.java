package BOOK;

import java.awt.*;
import java.math.BigDecimal;

public class MainforLibrary {
    public static void main(String[] args) {
        Book Book1 = new Book ("Незнайка", "Носов" );
        Book Book2 = new Book("Буратино", "Толстой");
        Book Book3 = new Book("Волшебник Изумрудного городаа", "Волков");
        Book Book4 = new Book("Винни Пух", "Милн");
        Book Book5 = new Book("Малыш и Карлсон", "Лингренд");
        Book Book6 = new Book("Пеппи Длинныйчулок", "Лингренд");
        Book Book7 = new Book("Том Сойер", "Твен");

        Library lybrary = new Library ();
        lybrary.addbook(Book1);
        lybrary.addbook(Book2);
        lybrary.addbook(Book3);
        lybrary.addbook(Book4);
        lybrary.addbook(Book5);
        lybrary.addbook(Book6);
        lybrary.addbook(Book7);

        TakenBooks Takenbooks = new TakenBooks();

        System.out.println(lybrary.getBookList());

        System.out.println(lybrary.findBookByName("Незнайка"));

        Takenbooks.addTakenBooks(lybrary.findBookByName("Незнайка"));

         lybrary.deletebook(lybrary.findBookByName("Незнайка"));



        System.out.println(lybrary.getBookList());
        System.out.println(Takenbooks.getTakenBookList());
    }


    }

