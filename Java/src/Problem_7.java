import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name" +  name + ", author" + author + '\'' + '}';
    }
}

class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook (Book book) {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }

    public void issueBook (Book book, String issued_to, String issued_on) {
        System.out.println("The book has been issued from the library to " +  issued_to + " and " + issued_on);
        this.books.remove(book);
    }

    public void returnBook (Book b) {
        System.out.println("The book has been returned to the library");
        Book book = null;
        this.books.add(book);
    }
}

public class Problem_7 {
    public static void main(String[] args) {
/*
        Create a Library Management System which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued To
        4. Issued On

        Users should be able to add books, return issued books, issue books.
        Assume that all the users are registered with their names in the central database.
*/

        ArrayList<Book> bk = new ArrayList<>();
        bk.add(new Book("Book1", "Author1"));
        bk.add(new Book("Book2", "Author2"));
        bk.add(new Book("Book3", "Author3"));

        MyLibrary l = new MyLibrary(bk);

        l.addBook(new Book("Book4", "Author4"));
        System.out.println(l.books);
    }
}
