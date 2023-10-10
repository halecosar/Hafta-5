import java.util.Comparator;

public class OrderPageNumComperator implements Comparator<Book> {
//Book sınıfında compareTo metodu kullanıldı,
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPageNumber() - o2.getPageNumber();
    }
}
