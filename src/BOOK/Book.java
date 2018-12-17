package BOOK;


    public class Book {
        private String Name;
        private String Author;
        private String KindOfGenre;
        private int Year;

        public Book(String Name, String Author, String KindOfGenre, int Year) {
            this.Name=Name;
            this.Author=Author;
            this.KindOfGenre=KindOfGenre;
            this.Year=Year;
        }
        public Book(String Name, String Author){
            this.Name=Name;
            this.Author=Author;
        }


        public String getName() {
            return Name;
        }

        public String getAuthor() {
            return Author;
        }



    }

