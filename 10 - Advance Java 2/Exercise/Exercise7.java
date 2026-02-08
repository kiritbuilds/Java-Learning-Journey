import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


// 1. Book ki Class (Data store karne ke liye)
class Book {
    public String name;
    public String author;
    public String issuedTo;
    public String issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null; // Shuru mein kisi ke paas nahi hai
        this.issuedOn = null;
    }
    
    @Override
    public String toString() {
        return "Book: " + name + " (Author: " + author + ")";
    }
}

// 2. Library Class (Management Logic)
class MyLibrary {
    // Books rakhne ke liye ArrayList (Generics use kiya)
    public ArrayList<Book> books;
    
    public MyLibrary() {
        this.books = new ArrayList<>();
    }
    
    // Method: Kitab Add karna
    public void addBook(String name, String author) {
        Book newBook = new Book(name, author);
        books.add(newBook);
        System.out.println("✅ Book Added: " + name);
    }

    // Method: Kitab Issue karna
    public void issueBook(String bookName, String studentName) {
        for (Book b : books) {
            if (b.name.equalsIgnoreCase(bookName)) { // Naam match hua?
                if (b.issuedTo == null) { // Kya kitab free hai?
                    b.issuedTo = studentName;
                    b.issuedOn = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
                    System.out.println("🎉 Success! '" + bookName + "' issued to " + studentName + " on " + b.issuedOn);
                    return;
                } else {
                    System.out.println(" Sorry! '" + bookName + "' is already with " + b.issuedTo);
                    return;
                }
            }
        }
        System.out.println(" Book not found in Library!");
    }
    
    // Method: Kitab Wapas Lena
    public void returnBook(String bookName) {
        for (Book b : books) {
            if (b.name.equalsIgnoreCase(bookName)) {
                if (b.issuedTo != null) {
                    System.out.println("📥 Book '" + bookName + "' returned. Thanks " + b.issuedTo + "!");
                    b.issuedTo = null; // Reset kar diya
                    b.issuedOn = null;
                    return;
                } else {
                    System.out.println(" Yeh kitab toh Library mein hi thi (Not issued).");
                    return;
                }
            }
        }
        System.out.println(" Book not found!");
    }
    
    // Available Books Dikhana
    public void showAvailableBooks() {
        System.out.println("\n📚 --- Available Books ---");
        for (Book b : books) {
            if (b.issuedTo == null) {
                System.out.println(b);
            }
        }
        System.out.println("--------------------------\n");
    }
}

// 3. Main Class (Testing)
public class Exercise7 {
    public static void main(String[] args) {
        // Library banayi
        MyLibrary lib = new MyLibrary();

        // 1. Books Add ki
        lib.addBook("Java Programming", "Harry Bhai");
        lib.addBook("Data Structures", "Kirit Bhai");
        lib.addBook("Rich Dad Poor Dad", "Robert Kiyosaki");

        // 2. List check ki
        lib.showAvailableBooks();

        // 3. Issue karne ka try kiya
        lib.issueBook("Java Programming", "Rohan"); // Success hona chahiye
        lib.issueBook("Java Programming", "Sohan"); // Fail hona chahiye (Already issued)

        // 4. Return kiya
        lib.returnBook("Java Programming");

        // 5. Final Status
        lib.showAvailableBooks();
    }
}
