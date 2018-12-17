import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input first number: ");
//        int a = in.nextInt();
//        System.out.print("Input second number: ");
//        int b = in.nextInt();
//
//        if (Multiplication(a, b) > 100) {
//            System.out.println(Multiplication(a, b));
//        } else {
//            System.out.println("The result of Multiplication is less than 100");
//        }
        Book a = new Book("a", "a");
        Book b = new Book("b", "b");
        Book c = new Book("c", "c");
        Library lybrary = new Library();
        lybrary.addBook(a);
        lybrary.addBook(b);
//        lybrary.addBook(c);
        Book thatBook = lybrary.findBookByName("q");
        if(thatBook != null){
            System.out.println(thatBook.getName() + "    " + thatBook.getAuthor());
        } else {
            System.out.println("go to hell");
        }
        System.out.println(lybrary.getBooks().contains(c));
    }

    public static int Multiplication(int a, int b) {
        int result = a * b;
        return result;

    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Book findBookByName(String name) {
        for (Book book : this.books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}

class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
