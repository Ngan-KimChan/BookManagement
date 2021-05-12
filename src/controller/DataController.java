package controller;

    import entity.Book;
import entity.Management;
import entity.Reader;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public DataController() {
    }

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openFileToRead(String fileName) {
        try {
            scanner = new Scanner(Paths.get(fileName),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeBookToFile(Book book, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(book.getBookId() + " | " + book.getBookName()
                + " | " + book.getAuthor() + " | " + book.getSpecialization()
                + " | " + book.getPublishYear() + " | " + book.getQuantity());
        closeFileAfterWrite(fileName);
    }

    public void writeReaderToFile(Reader reader, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(reader.getReaderId() + " | " + reader.getFullName()
                + " | " + reader.getAddress() + " | " + reader.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    public void writeManagementToFile (Management management, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(management.getBook().getBookId()
                + " | " + management.getReader().getReaderId()
                + " | " + management.getNumOfBorrow()
                + " | " + management.getState());
        closeFileAfterWrite(fileName);
    }

    public ArrayList<Book> readBooksFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Book> books = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String datas = scanner.nextLine();
            Book book = createBookFromData(datas);
            books.add(book);
        }
        closeFileAfterRead(fileName);
        return books;
    }

    public ArrayList<Reader> readReadersFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Reader> readers = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            Reader reader = createReaderFromData(data);
            readers.add(reader);
        }
        closeFileAfterRead(fileName);
        return readers;
    }

    public ArrayList<Management> readBRMsFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Management> managementList = new ArrayList<> ();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Management management = createManagementFromData(data);
            managementList.add(management);
        }
        closeFileAfterRead(fileName);
        return managementList;
    }

    private Book createBookFromData(String data) {
        String[] datas = data.split("\\|");
        return new Book(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3],
                            Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));
    }

    public Reader createReaderFromData(String data) {
        String[] datas = data.split("\\|");
        return new Reader(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3]);
    }

    public Management createManagementFromData(String data){
        String[] datas = data.split("\\|");
        return new Management(new Reader(Integer.parseInt(datas[0])),
                new Book(Integer.parseInt(datas[1])),
                Integer.parseInt(datas[2]), datas[3]);
    }

    public void closeFileAfterWrite(String fileName) {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeFileAfterRead(String fileName) {
        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
