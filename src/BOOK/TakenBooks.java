package BOOK;

import java.util.ArrayList;

public class TakenBooks {

        private ArrayList<Book> TakenBookList = new ArrayList<>();

        public void addTakenBooks (Book book){
            this.TakenBookList.add(book);
        }

    public ArrayList<Book> getTakenBookList() {
        return TakenBookList;
    }
}
