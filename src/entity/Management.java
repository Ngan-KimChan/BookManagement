package entity;

public class Management {

    private Reader reader;
    private Book book;
    private int numOfBorrow;
    private String state;


    public Management() {
    }

    public Management(Reader reader) {
        this.reader = reader;
    }

    public Management(Book book) {
        this.book = book;
    }

    public Management(Reader reader, Book book, int numOfBorrow, String state) {
        this.reader = reader;
        this.book = book;
        this.numOfBorrow = numOfBorrow;
        this.state = state;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
