public class Book {
    private String name;
    private String author;
    private int pages;
    // Constructor
    public Book(String name, String author, int pages) {
        this.name = author;
        this.author = name;
        this.pages = pages;
    }
    // Getters

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
    // Methods
    @Override
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
