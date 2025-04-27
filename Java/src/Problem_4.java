class Library {

    private String[] availableBooks;
    private String[] issuedBooks;
    private int availableCount;
    private int issuedCount;

    public Library() {
        availableBooks = new String[100];
        issuedBooks = new String[100];
        availableCount = 0;
        issuedCount = 0;
    }

    public void addBook(String Book) {
        availableBooks[availableCount] = Book;
        availableCount++;
        System.out.println("Book added: " + Book);
    }

    public void issueBook(String Book) {
        for (int i = 0; i < availableCount; i++) {
            if (availableBooks[i] != null && availableBooks[i].equals(Book)) {
                issuedBooks[issuedCount] = Book;
                issuedCount++;
                System.out.println("Book Issued: " + Book);
                availableBooks[i] = null;
                return;
            }
        }
        System.out.println("Sorry, Book not available for issue.");
    }

    public void returnBook(String Book) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i] != null && issuedBooks[i].equals(Book)) {
                availableBooks[availableCount] = Book;
                availableCount++;
                System.out.println("Book Returned: " + Book);
                issuedBooks[i] = null;
                return;
            }
        }
        System.out.println("This book is not issued from this library.");
    }

    public void showAvailableBooks() {
        for (int i = 0; i < availableCount; i++) {
            if (availableBooks[i] != null) {
                System.out.println(availableBooks[i]);
            }
        }
    }
}

public class Problem_4 {
    public static void main(String[] args) {
        /*
         * You have to implement a library using JAVA Class Library
         * Methods: addBook, issueBook, returnBook, showAvailableBooks
         * Properties: (1) Array to store the available books
         * (2) Array to store the issued books
         */

        Library lib = new Library();

        lib.addBook("The Great Gatsby");
        lib.addBook("1984");
        lib.addBook("To kill a Mockingbird");

        System.out.println("\nAvailable Books: ");
        lib.showAvailableBooks();

        System.out.println();

        lib.issueBook("1984");
        System.out.println("\nAvailable Books after issuing '1984': ");
        lib.showAvailableBooks();

        lib.returnBook("1984");

        System.out.println("\nAvailable Books after returning '1984': ");
        lib.showAvailableBooks();
    }
}
