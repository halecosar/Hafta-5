import java.util.Scanner;

public class PatikaStore {
    Scanner scanner = new Scanner(System.in);

    public void startShopping() {
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println(" 1 - Notebook İşlemleri\n" +
                    " 2 - Telefon İşlemleri\n" +
                    " 3 - Marka Listele\n" +
                    " 0 - Çıkış Yap");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");

            switch (scanner.nextInt()) {
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.productMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.productMenu();
                    break;
                case 3:
                    Brand.printBrands();
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı.");
                    return;
                default:
                    System.out.println("Hatalı değer girdiniz.");
                    break;
            }
        }
    }
}
