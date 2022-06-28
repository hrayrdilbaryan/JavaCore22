package homework.books;

import java.util.Scanner;

public class BooksDemo implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Books("Моя борьба", "Адольф Гитлер", 550, 2, "Биография"));
        bookStorage.add(new Books("Капитал", "Карл Макс", 340, 1, "Классика"));
        bookStorage.add(new Books("Паганини", "Тибальди-Кьеза Мария", 750, 3, "Биография"));

        boolean run = true;
        while (run) {
            System.out.println("input " + EXIT + " for exit");
            System.out.println("input " + ADD_BOOK + " for add book");
            System.out.println("input " + PRINT_ALL_BOOKS + " for print book");
            System.out.println("input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
            System.out.println("input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("input " + PRINT_BY_PRICE_RANGE + " for print by price range");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command){
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
                default:
                    System.out.println("invalid command");
            }

        }
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
        bookStorage.printByPriceReng(price,price1);
    }

    private static void addBooks() {
        System.out.println("Please input books title");
        String title = scanner.nextLine();
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input books price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input books count");
        String countStr = scanner.nextLine();
        System.out.println("Please input books genre");
        String genre = scanner.nextLine();

        double price = Double.parseDouble(priceStr);
        int count = Integer.parseInt(countStr);
        Books books = new Books(title, authorName, price, count, genre);
        bookStorage.add(books);
    }


}
