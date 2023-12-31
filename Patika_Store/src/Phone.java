import java.util.ArrayList;
import java.util.Optional;
// default değer girmedim, kendi ekleyeceğiniz ürünlerle consoldan testini gerçekleştirebilirisiniz.
public class Phone extends Product {
    private static int id = 1;
    private int battery;
    private String color;
    private static ArrayList<Phone> phones = new ArrayList<>(); //Telefonların olacağı bir arraylist tanımlandı.

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
                "4 - Telefonları  ID'ye göre filtrele \n" +
                "5 - Telefonları  markaya göre filtrele");

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
        System.out.print("Ürün adını giriniz : ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Ürün fiyatını giriniz :");
        int price = scan.nextInt();
        System.out.print("Ürünün indirim oranını giriniz : ");
        int discountRate = scan.nextInt();
        System.out.print("Ürünün stok bilgisini giriniz :");
        int stock = scan.nextInt();

        int ram = 6; //soruda sabit verilen değerler kullanıcıdan istenmedi.
        String screenSize = "6.1 INC";
        String memoryName = "";
        int battery = 4000;

        while (memoryName == "") {
            System.out.println("Ürünün hafızasını seçiniz : \n" +
                    "1-128 GB \n" +
                    "2-64 GB");
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



        String productColor = "";
        while (productColor == "") {
            System.out.println("Ürünün rengini seçiniz:\n" +
                    " 1- Kırmızı \n" +
                    " 2- Siyah \n" +
                    " 3- Mavi");
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


        Phone phone = new Phone(name, price, discountRate, stock, brand, screenSize, ram, memoryName, battery, productColor);
        phones.add(phone);

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
        System.out.println("Silmek istediğiniz telefon ID'sini yazınız :");
        int selectedID = scan.nextInt();
        Phone deletedPhone = null;
        for (Phone phone : phones) {
            if (phone.getId() == selectedID) {
                deletedPhone = phone;
            }
        }
        if (deletedPhone == null) {
            System.out.println("Geçersiz Telefon ID");
        } else {
            phones.remove(deletedPhone);
            System.out.print("Telefon listeden silinmiştir. Lütfen kontrol ediniz.");
            print(phones);
        }

    }


    private void brandFilterbyID() { //filtreleme için marka ve id'ye yönelik  2 ayrı metod yazıldı.
        print(phones);
        System.out.println("Filtrelemek istediğiniz telefon ID'sini yazınız :");
        int filteredID = scan.nextInt();
        ArrayList<Phone> filteredPhones = new ArrayList<>();

        for (Phone phone : phones) {
            if (phone.getId() == filteredID) {
                filteredPhones.add(phone);
            }
        }

        print(filteredPhones);
    }

    private void brandFilterbyBrand() {
        Brand.printBrands();
        boolean check = true;

        while (check == true) {
            System.out.println("Filtrelemek istediğiniz telefon markasını seçiniz :");

            int filteredBrands = scan.nextInt();
            if (filteredBrands > 0 && filteredBrands < 10) {
                check = false;
                ArrayList<Phone> filteredPhones = new ArrayList<>();

                for (Phone phone : phones) {
                    if (phone.getBrand().getId() == filteredBrands) {
                        filteredPhones.add(phone);
                    }
                }

                print(filteredPhones);
            }

        }
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
