package moldel;

public class Book {
    private int id;
    private String nameBook;
    private String category;
    private String author;

    public Book() {
    }

    public Book(int id, String nameBook, String category, String author) {
        this.id = id;
        this.nameBook = nameBook;
        this.category = category;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
