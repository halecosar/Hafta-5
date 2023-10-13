import java.util.ArrayList;
import java.util.Optional;
// default değer girmedim, kendi ekleyeceğiniz ürünlerle consoldan testini gerçekleştirebilirisiniz.
public class Notebook extends Product {
    private static int id = 1;
    private static ArrayList<Notebook> notebooks = new ArrayList<>();


    public Notebook(String name, int price, int discountRate, int stock, Brand brand, String screenSize, int ram, String memory) {

        super(id, name, price, discountRate, stock, brand, screenSize, ram, memory);
        id++;
    }

    public Notebook() {

    }

    @Override
    public void productMenu() {

        System.out.println("1- Notebook listesini görüntüle\n" +
                "2- Yeni Notebook ekle \n" +
                "3- Notebook sil\n" +
                "4- Notebookları ID'ye göre filtrele\n" +
                "5- Notebookları markaya göre filtrele");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int select = scan.nextInt();
        switch (select) {
            case 1:
                getProducts();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                brandFilterbyID();
                break;
            case 5:
                brandFilterbyBrand();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, lütfen tekrar giriniz.");
                productMenu();
        }
    }

    @Override
    public void addProduct() {
        System.out.print("Ürünün adını giriniz : ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Ürünün stok bilgisini giriniz : ");
        int stock = scan.nextInt();
        System.out.print("Ürünün indirim oranını giriniz: ");
        int discountRate = scan.nextInt();

        System.out.print("Ürünün fiyatını giriniz : ");
        int price = scan.nextInt();

        int ram = 8;
        String screenSize = "14 INC";
        String memory = "512 SSD";

        Brand.printBrands();

        Brand brand = null;
        String brandName = "";
        while (brandName == "") {
            System.out.print("Marka Seçiniz : ");
            brand = Brand.getBrand(scan.nextInt());
            if (brand != null) {
                brandName = brand.getName();
            }
        }

        Notebook notebook = new Notebook(name, price, discountRate, stock, brand, screenSize, ram, memory);
        this.notebooks.add(notebook);

    }

    @Override
    public void getProducts() {
        print(null);

    }

    public void print(ArrayList<Notebook> notebookList) {
        if (notebookList == null) notebookList = this.notebooks;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook notebook : notebookList) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrand().getName(), notebook.getStock(),
                    notebook.getDiscountRate(), notebook.getRam(), notebook.getScreenSize(), notebook.getMemory());
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Silmek istediğiniz notebook ID'sini yazınız :");
        int selectedID = scan.nextInt();
        Notebook deletedNotebook = null;
        for (Notebook notebook : notebooks) {
            if (notebook.getId() == selectedID) {
                deletedNotebook = notebook;
            }
        }
        if (deletedNotebook == null) {
            System.out.println("Geçersiz notebook ID");
        } else {
            notebooks.remove(deletedNotebook);
            System.out.print("Notebook listeden silinmiştir. Lütfen kontrol ediniz.");
            print(notebooks);
        }
    }

    private void brandFilterbyID() {
        print(notebooks);
        System.out.println("Filtrelemek istediğiniz notebook ID'sini yazınız :");
        int filteredID = scan.nextInt();
        ArrayList<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            if (notebook.getId() == filteredID) {
                filteredNotebooks.add(notebook);
            }
        }

        print(filteredNotebooks);
    }

    private void brandFilterbyBrand() {
        Brand.printBrands();
        boolean check = true;

        while (check == true) {
            System.out.println("Filtrelemek istediğiniz notebook markasını seçiniz :");

            int filteredBrands = scan.nextInt();
            if (filteredBrands > 0 && filteredBrands < 10) {
                check = false;
                ArrayList<Notebook> filteredNotebooks = new ArrayList<>();

                for (Notebook notebook : notebooks) {
                    if (notebook.getBrand().getId() == filteredBrands) {
                        filteredNotebooks.add(notebook);
                    }
                }

                print(filteredNotebooks);
            }

        }
    }
}
