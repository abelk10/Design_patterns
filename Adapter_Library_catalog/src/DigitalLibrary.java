import java.util.ArrayList;

public class DigitalLibrary {
    ArrayList<DigitalBook> books;

    public DigitalLibrary() {
        this.books = new ArrayList<>();
    }
    public void addBook(DigitalBook b){
        books.add(b);
    }
    public void findByTitle(String title){
        for(DigitalBook b: books){
            if(b.getTitle() == title){
                System.out.println("[Digital book]\n\tTitle:" + b.getTitle()  + "\n\tAuthor:" + b.getAuthor()  + "\n\tPlace:"+ b.getLocation());
            }
        }
    }
    public void findByAuthor(String author){
        for(DigitalBook b: books){
            if(b.getAuthor() == author){
                System.out.println("[Digital book]\n\tTitle:" + b.getTitle()  + "\n\tAuthor:" + b.getAuthor()  + "\n\tPlace:"+ b.getLocation());
            }
        }
    }
}
