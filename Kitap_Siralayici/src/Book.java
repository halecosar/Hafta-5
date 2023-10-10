import java.util.TreeSet;

public class Book{

    private String bookName;
    private String authorName;
    private String publishYear;
    private int pageNumber;



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }


    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Book(String bookName, String authorName, String publishYear, int pageNumber) {
        super();
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.pageNumber = pageNumber;

    }
}



