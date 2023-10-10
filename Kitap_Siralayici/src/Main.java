import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<Book>(new OrderbyName());
        TreeSet<Book> books1 = new TreeSet<Book>(new OrderPageNumComperator());
/* iki ayrı parametreye göre sıralama yapılacağı ve soruda set istenmesi sebebiyle arrayList kullanamayacağımız için
    2 kere listeyi yazıp nesne ismini değiştirdim (books ve books1)
 */
        books.add(new Book("Arkadaşlık", "Ahmet X", "2021", 80));
        books.add(new Book("Dostluk", "Derya Y", "2000", 95));
        books.add(new Book("Canlılar", "Ceren Z", "2016", 60));
        books.add(new Book("Kediler", "Kenan S", "2011", 100));
        books.add(new Book("Ziyafet", "Zehar Z", "2001", 58));

        books1.add(new Book("Arkadaşlık", "Ahmet X", "2021", 80));
        books1.add(new Book("Dostluk", "Derya Y", "2000", 95));
        books1.add(new Book("Canlılar", "Ceren Z", "2016", 60));
        books1.add(new Book("Kediler", "Kenan S", "2011", 100));
        books1.add(new Book("Ziyafet", "Zehar Z", "2001", 58));


        System.out.println("Alfabetik sıralamaya  göre kitap sırası : ");

        for (Book b2 : books) {
            System.out.println(b2.getBookName());

        }
        System.out.println("==========================================");

        System.out.println("Sayfa Sayısına göre sıralama :");

        for (Book b : books1) {
            System.out.println(b.getPageNumber() + "==> " + "("+b.getBookName()+")");
        }
    }
}