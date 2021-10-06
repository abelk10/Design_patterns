// Abel Kahsay Gebreslassie
// Neptun ID: PS70N2
public class LibraryDemo {
    static DigitalLibrary d;
    static CatalogLibrary c;
    static CatalogLibraryAdapter cla;
    public static void main(String[] args){
        d = new DigitalLibrary();
        c = new CatalogLibrary();
        d.addBook(new DigitalBook("Rolf Dobelli", "The art of thinking clearly", "US"));
        d.addBook(new DigitalBook("Yuval Noah Harari", "Sapiens", "Israel"));
        d.addBook(new DigitalBook("Daniel Kahneman","Thinking_ Fast and Slow", "US"));
        d.addBook(new DigitalBook("John Doe", "Book A - vol 2", "Sumwher"));
        c.addBook(new CatalogBook("Conan Doyle|The Adventures of Sherlock Holmes|Place a"));
        c.addBook(new CatalogBook("Paulo Coelho|The Alchemist|US"));
        c.addBook(new CatalogBook("John Doe|Book A - vol 1|Sumwher"));
        cla = new CatalogLibraryAdapter(c);
        findByTitle("Sapiens");
        findByAuthor("Daniel Kahneman");
        findByAuthor("John Doe");
    }
    public static void findByTitle(String title){
        System.out.println("[Searching...] book titled: " +title);
        d.findByTitle(title);
        cla.findByTitle(title);
    }
    public static void findByAuthor(String author){
        System.out.println("[Searching...] books by: " +author+ "...");
        d.findByAuthor(author);
        cla.findByAuthor(author);
    }
}
