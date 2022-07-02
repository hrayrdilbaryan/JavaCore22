package homework.book;

public interface Command {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_AUTHOR = 7;

    static void printCommand(){
        System.out.println("input " + EXIT + " for exit");
        System.out.println("input " + ADD_BOOK + " for add book");
        System.out.println("input " + PRINT_ALL_BOOKS + " for print book");
        System.out.println("input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
        System.out.println("input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("input " + PRINT_BY_PRICE_RANGE + " for print by price range");
        System.out.println("input " + ADD_AUTHOR + " for add author");
        System.out.println("input " + PRINT_AUTHOR + " for print author");
    }
}
