package Library;

public class Book {
    private String bookName;
    private String author;
    private String pubilsher;
    private String language;
    private boolean available;
    private int pageCount;
    private double price;

    public Book(String bookName, String author, String pubilsher, String language, boolean available, int pageCount, double price){
        this.bookName = bookName;
        this.author = author;
        this.pubilsher = pubilsher;
        this.language = language;
        this.available = available;
        this.pageCount = pageCount;
        this.price = price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPubilsher(String pubilsher) {
        this.pubilsher = pubilsher;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPubilsher() {
        return pubilsher;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }
}
