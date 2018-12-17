package BOOK;

import java.util.ArrayList;

public class Library {

        private ArrayList<Book> BookList = new ArrayList<>();

        public void addbook (Book book){
            this.BookList.add(book);
        }

    public void deletebook (Book book){
        this.BookList.remove(book);
    }
    public ArrayList<Book> getBookList() {
        return BookList;
    }
    public Book findBookByName(String name) {
        for (Book book : this.BookList) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }
}

