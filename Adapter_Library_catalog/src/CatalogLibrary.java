import java.util.ArrayList;

public class CatalogLibrary {
    ArrayList<CatalogBook> books;

    public CatalogLibrary() {
        this.books = new ArrayList<>();
    }
    public void addBook(CatalogBook b){
        books.add(b);
    }
    public ArrayList<CatalogBook> getBooks(){
        return books;
    }
}
