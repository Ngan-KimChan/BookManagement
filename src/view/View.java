package view;

import controller.DataController;
import entity.Book;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1.Add a new book to the Book file");
            System.out.println("2.Print the list of book in the Book file");
            System.out.println("3.Add a new reader to the Reader file");
            System.out.println("4.Print the list of reader in the Reader file");
            System.out.println("5.Adding the borrowing information to the Management file");
            System.out.println("6.Sorting the borrowing information in the Management file");
            System.out.println("7.Finding the borrowing information of Reader in the Management file ");
            System.out.println("0.Exit");
            System.out.println("Your choise:");

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
                    int bookId, year, quantity, spofbook;


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


                    DataController.writeBookToFile(book, "BOOK.DAT");
                    break;

                }

                case 2: {

                }

            }
        } while (choice != 0);
    }
}
