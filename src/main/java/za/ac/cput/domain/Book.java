package za.ac.cput.domain;

public class Book {
    private String isbn;
    private String title;
    private String author;

    private Book(){

    }
    private Book(Builder builder){
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.author = builder.author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    private static class Builder{
       private String isbn;
       private String title;
       private String author;

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }
        public Book build(){return new Book(this);}
    }


}
