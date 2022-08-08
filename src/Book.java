public class Book {

    private final String name;
    private int publishDate;
    private Author author;

    public Book(String name, Author author, int publishDate) {
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public  int setPublishDate() {
        return this.publishDate;
    }

    public String toString() {
        return this.publishDate + " " + this.getName();
    }
}
