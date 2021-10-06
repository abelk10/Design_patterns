import java.util.ArrayList;

public class CatalogLibraryAdapter {
    CatalogLibrary cl;
    public CatalogLibraryAdapter(CatalogLibrary cl) {
        this.cl = cl;
    }
    public void findByTitle(String title){
        ArrayList<CatalogBook> books = cl.getBooks();
        for(CatalogBook b: books){
            String[] index = b.getIndex().split("\\|");
            if(index[1].equals(title))
                System.out.println("[Catalog book]\n\tTitle:" + index[1]  + "\n\tAuthor:" + index[0]  + "\n\tPlace:"+ index[2]);
        }
    }
    public void findByAuthor(String author){
        ArrayList<CatalogBook> books = cl.getBooks();
        for(CatalogBook b: books){
            String[] index = b.getIndex().split("\\|");
            if(index[0].equals(author))
                System.out.println("[Catalog book]\n\tTitle:" + index[1]  + "\n\tAuthor:" + index[0]  + "\n\tPlace:"+ index[2]);
        }
    }
}
