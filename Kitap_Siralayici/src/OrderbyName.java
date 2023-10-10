import java.util.Comparator;

class OrderbyName implements Comparator<Book> {
    @Override

    public int compare(Book o1, Book o2) {
        return new String(o1.getBookName()).compareTo(o2.getBookName());
    }
}