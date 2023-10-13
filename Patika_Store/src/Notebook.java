import java.util.ArrayList;
import java.util.Optional;

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
                "4- Notebookları markaya göre filtrele");
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
                brandFilter();
                break;
            case 0:
                productMenu();
                break;
            default:
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

    }

    private void brandFilter() {

    }
}
