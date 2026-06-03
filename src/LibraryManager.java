import java.util.TreeSet;

public class LibraryManager {
    private TreeSet<String> books = new TreeSet<>();

    public void addBook(String title) {
        if (title != null && !title.trim().isEmpty()) {
            books.add(title);
        }
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public boolean isBookAvailable(String title) {
        return books.contains(title);
    }

    public void displayAllBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void displayBooksStartingWith(char letter) {
        String start = String.valueOf(letter).toUpperCase();
        String end = String.valueOf((char) (letter + 1)).toUpperCase();
        for (String book : books.subSet(start, end)) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        System.out.println("====== TASK 1: LIBRARY MANAGER ======");
        LibraryManager library = new LibraryManager();
        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Algorithms");
        library.addBook("Java Programming");
        System.out.println("Available: " + library.isBookAvailable("Algorithms"));
        library.displayAllBooks();
        System.out.println("Starting with 'J':");
        library.displayBooksStartingWith('J');
    }
}