public class DigitalBook implements Book{
    String author;
    String title;
    String location;

    public DigitalBook(String author, String title, String location) {
        this.author = author;
        this.title = title;
        this.location = location;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }
}
