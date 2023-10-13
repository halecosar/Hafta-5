import java.util.ArrayList;
import java.util.Optional;

public class Phone extends Product {
    private static int id = 1;
    private int battery;
    private String color;
    private static ArrayList<Phone> phones = new ArrayList<>();

    public Phone(String name, int price, int discountRate, int stock,
                 Brand brand, String screenSize, int ram, String memory,
                 int battery, String color) {
        super(id, name, price, discountRate, stock, brand, screenSize, ram, memory);
        id++;
        this.battery = battery;
        this.color = color;
    }

    public Phone() {

    }

    @Override
    public void productMenu() {
        System.out.println("Telefon Yönetim Paneli:\n" +
                "1 - Telefon Listeleme\n" +
                "2 - Telefon ekleme\n" +
                "3 - Telefon Silme \n" +
                "4 - Telefon Filtreleme \n" +
                "0 - Ana menüye dön");

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
        System.out.print("Ürün adını giriniz : ");
        String name = scan.nextLine();
        scan.nextLine();
        System.out.print("Ürün fiyatını giriniz :");
        int price = scan.nextInt();


        System.out.print("Ürünün indirim oranını giriniz : ");
        int discountRate = scan.nextInt();
        System.out.print("Ürünün stok bilgisini giriniz :");
        int stock = scan.nextInt();

        int ram = 6;

        String screenSize = "6.1 INC";

        String memoryName = "";
        while (memoryName == "") {
            System.out.print("Ürünün hafızasını seçiniz :" +
                    "1- 128 GB  \n " +
                    "2- 64 GB");
            int memory = scan.nextInt();
            switch (memory) {
                case 1:
                    memoryName = "128 GB";
                    break;
                case 2:
                    memoryName = "64 GB";
                    break;
                default:
                    System.out.println("Geçerli bir hafıza seçimi giriniz");
            }

        }

        int battery = 4000;

        String productColor = "";
        while (productColor == "") {
            System.out.println("Ürünün rengini seçiniz:" +
                    " 1- Kırmızı \n " +
                    " 2- Siyah \n " +
                    " 3- Mavi : ");
            int selectColor = scan.nextInt();
            switch (selectColor) {
                case 1:
                    productColor = "Kırmızı";
                    break;
                case 2:
                    productColor = "Siyah";
                    break;
                case 3:
                    productColor = "Mavi";
                    break;
                default:
                    System.out.println("Geçerli bir renk giriniz");
            }
        }


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

        //Ürün oluşturuldu.
        Phone phone = new Phone(name, price, discountRate, stock, brand, screenSize, ram, memoryName, battery, productColor);
        phones.add(phone);      //id verildi ve listeye eklendi
        System.out.println("Eklenen telefonun id'si :" + phone.getId());
    }

    public void getProducts() {
        print(null);
    }

    public void print(ArrayList<Phone> phoneList) {
        if (phoneList == null) phoneList = this.phones;
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone phone : phoneList) {
            System.out.format("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s \n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrand().getName(), phone.getStock(),
                    phone.getDiscountRate(), phone.getRam(), phone.getScreenSize(), phone.getMemory(), phone.getBattery(), phone.getColor());
        }
    }

    @Override
    public void deleteProduct() {

    }

    public void brandFilter() {

    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
