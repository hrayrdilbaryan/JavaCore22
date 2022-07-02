package homework.book;

import homework.book.model.Author;
import homework.book.model.Books;
import homework.book.storage.AuthorStorage;
import homework.book.storage.BookStorage;

import java.util.Scanner;

public class BooksDemo implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();



    public static void main(String[] args) {

        Author sevak = new Author("parur","sevak","parursevak@mail.ru","male");
        Author hovanes = new Author("hovanes","tumanyan","hov.tum@mail.ru","male");
        Author silva = new Author("silva","kaputikyan","kaput.sil@mail.ru","female");
        authorStorage.add(sevak);
        authorStorage.add(hovanes);
        authorStorage.add(silva);

        bookStorage.add(new Books("Моя борьба", sevak, 550, 2, "Биография"));
        bookStorage.add(new Books("Капитал", hovanes, 340, 1, "Классика"));
        bookStorage.add(new Books("Паганини", silva, 750, 3, "Биография"));

        boolean run = true;
        while (run) {
            Command.printCommand();


            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printArray();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    authorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    genre();
                    break;
                case PRINT_BY_PRICE_RANGE:
                    priceRenge();
                    break;
                case ADD_AUTHOR:
                    addauthor();
                    break;
                case PRINT_AUTHOR:
                    authorStorage.print();
                    break;

                default:
                    System.out.println("invalid command");
            }

        }
    }

    private static Author addauthor(){
        System.out.println("input author name");
        String author = scanner.nextLine();
        System.out.println("input author surname");
        String surname = scanner.nextLine();
        System.out.println("input author email");
        String email = scanner.nextLine();
        System.out.println("chose author gender 1 is male - 2 is female");
        String gender = String.valueOf(scanner.nextLine().charAt(0));
        if (Integer.parseInt(gender) == 1){
            gender = "male";
        }else if(Integer.parseInt(gender) == 2){
            gender = "female";

        }
        Author author1 = new Author(author,surname,email,gender);
        authorStorage.add(author1);
        return author1;


    }

    private static void authorName() {
        System.out.println("please input author name");
        String author = scanner.nextLine();
        bookStorage.printBookByAuthor(author);
    }

    private static void genre() {
        System.out.println("please input book genre");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void priceRenge() {
        System.out.println("please input first price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input last price");
        double price1 = Double.parseDouble(scanner.nextLine());
        bookStorage.printByPriceReng(price, price1);
    }

    private static void addBooks() {
        System.out.println("Please input books title");
        String title = scanner.nextLine();
        Author addNewAuthor = addauthor();
        System.out.println("Please input books price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input books count");
        String countStr = scanner.nextLine();
        System.out.println("Please input books genre");
        String genre = scanner.nextLine();

        double price = Double.parseDouble(priceStr);
        int count = Integer.parseInt(countStr);
        Books books = new Books(title, addNewAuthor, price, count, genre);
        bookStorage.add(books);

    }


}
