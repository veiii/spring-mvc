package hello;

public class Book {

    private String title;
    private String author;
    private int pageNumber;
    private String status;
    private boolean isAvaliable;
    private String cover;


    public Book(String title, String author, int pageNumber, String status, boolean isAvaliable, String cover) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.status = status;
        this.isAvaliable = isAvaliable;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getStatus() {
        return status;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public String getCover() {
        return cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", status='" + status + '\'' +
                ", isAvaliable=" + isAvaliable +
                ", cover='" + cover + '\'' +
                '}';
    }
}
