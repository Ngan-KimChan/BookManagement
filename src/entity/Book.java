package entity;

public class Book {


    private int bookId= 1;
    private String bookName;
    private String author;
    private String specialization;
    private int publishYear;
    private int quantity;

    public Book() {
    }

    public Book(int bookId) {
        this.bookId = bookId;
    }

    public Book(int bookId, String bookName, String author, String specialization, int publishYear, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.specialization = specialization;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }



    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [ BookID=" + bookId + " | Book Title: " + bookName+ " | Author: "+ author
                + " | Publish Year: " + publishYear + " | Quantity: " + quantity
                + " | Specialization: " + specialization + " ]";
    }
}
