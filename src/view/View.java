package view;

import controller.DataController;
import entity.Book;
import entity.Reader;

import java.io.File;
import java.util.Scanner;


public class View {
    public static void main(String[] args) {

        int choice;
DataController dataController = new DataController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1.Add a new book to the Book file");
            System.out.println("2.Print the list of book in the Book file");
            System.out.println("3.Add a new reader to the Reader file");
            System.out.println("4.Print the list of reader in the Reader file");
            System.out.println("0.Exit");
            System.out.println("Your Choice:");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0: {
                    System.out.println("___________________________");
                    System.out.println("Thank you");
                    break;
                }

                case 1: {
                    String bookName, author, specialization;
                    int bookId, year, quantity;

                    System.out.println("Enter the Id of the book: ");
                    bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the name of the book: ");
                    bookName = scanner.nextLine();

                    System.out.println("Enter the author of the book: ");
                    author = scanner.nextLine();

                    System.out.println("Enter the specialization of the book: ");
                    specialization = scanner.nextLine();

                    System.out.println("Enter the publish year: ");
                    year = scanner.nextInt();

                    System.out.println("Enter the quantity: ");
                    quantity = scanner.nextInt();

                    Book book = new Book(bookId, bookName, author, specialization, year, quantity);


                    dataController.writeBookToFile(book, new File("src/data/BOOK.DAT").getAbsolutePath());
                    break;
                }

                case 2: {
                    for (Book book : dataController.readBooksFromFile(new File("src/data/BOOK.DAT").getAbsolutePath())) {
                        System.out.println(book.toString());
                    }
                    break;
                }
                case 3: {
                    String fullName, address, phoneNumber;
                    int readerId;


                    System.out.println("Enter the reader's ID: ");
                    readerId  = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the reader's name: ");
                    fullName = scanner.nextLine();

                    System.out.println("Enter the reader's address: ");
                    address = scanner.nextLine();

                    System.out.println("Enter the reader's phoneNumber: ");
                    phoneNumber = scanner.nextLine();

                    Reader reader = new Reader(readerId, fullName, address, phoneNumber);



                    dataController.writeReaderToFile(reader,new File("src/data/READER.DAT").getAbsolutePath());
                    break;
                }

                case 4: {
                    for (Reader reader : dataController.readReadersFromFile(new File("src/data/BOOK.DAT").getAbsolutePath())) {
                        System.out.println(reader.toString());
                    }
                    break;
                }


            }
        } while (choice != 0);
    }


}
