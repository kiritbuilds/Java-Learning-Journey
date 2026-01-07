class Library {
    String[] availableBooks;
    String[] issuedBooks;
    int availableCount;
    int issuedCount;

    Library() {
        availableBooks = new String[100];
        issuedBooks = new String[100];
        availableCount = 0;
        issuedCount = 0;
    }

    void addBook(String book) {
        availableBooks[availableCount] = book;
        availableCount++;
        System.out.println(book + " has been added to Library");
    }

    void showAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < availableCount; i++) {
            if (availableBooks[i] != null) {
                System.out.println("* " + availableBooks[i]);
            }
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < availableCount; i++) {
            if (availableBooks[i] != null && availableBooks[i].equals(book)) {
                System.out.println(book + " has been issued");
                issuedBooks[issuedCount] = book;
                issuedCount++;
                availableBooks[i] = null;
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(String book) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i] != null && issuedBooks[i].equals(book)) {
                System.out.println(book + " has been returned");
                availableBooks[availableCount] = book;
                availableCount++;
                issuedBooks[i] = null;
                return;
            }
        }
        System.out.println("This book was not issued");
    }
}

public class LibraryPrac {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("C++");

        lib.showAvailableBooks();

        lib.issueBook("Java");
        lib.showAvailableBooks();

        lib.returnBook("Java");
        lib.showAvailableBooks();
    }
}
